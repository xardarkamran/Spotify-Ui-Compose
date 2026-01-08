package com.navigation.live.spotifyuitesting.ui.screens.home_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.navigation.live.spotifyuitesting.R
import com.navigation.live.spotifyuitesting.ui.theme.ColorPrimary

@Composable
fun HomeScreen() {

    val tabs = listOf("News", "Video", "Artist", "Podcasts")
    var selectedIndex by remember {
        mutableIntStateOf(0)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .padding(16.dp)
        ) {

            SpotifyLogoWithText(
                modifier = Modifier
                    .width(108.dp)
                    .height(33.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(20.dp))

            HighLightCard()

            Spacer(modifier = Modifier.height(20.dp))

            TabRow(
                tab = tabs,
                selectedIndex = selectedIndex
            ) {
                selectedIndex = it
            }

            Spacer(modifier = Modifier.height(35.dp))

            AlbumCard()

        }
    }
}

@Composable
private fun HighLightCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomStart)
                .size(130.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(ColorPrimary)
                .padding(horizontal = 18.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "New Album",
                color = Color.White,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Happier Than Ever",
                color = Color.White,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(
                modifier = Modifier.height(22.dp)
            )

            Text(
                text = "Billie Eilish",
                color = Color.White,
                fontSize = 16.sp
            )

        }

        Image(
            painter = painterResource(R.drawable.img_artist_home_card),
            contentDescription = "image artist home card",
            modifier = Modifier
                .size(160.dp)
                .align(Alignment.TopEnd)
        )

    }
}

@Composable
private fun TabRow(
    tab: List<String>,
    selectedIndex: Int,
    selectedItem: (Int) -> Unit = {}
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(18.dp)
    ) {

        tab.forEachIndexed { index, text ->
            val selected = index == selectedIndex
            Column(
                modifier = Modifier
                    .weight(1f)
                    .clickable { selectedItem(index) },
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = text,
                    color = if (selected) Color.White else Color.Gray,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(4.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(4.dp)
                        .clip(RoundedCornerShape(0.dp, 0.dp, 10.dp, 10.dp))
                        .background(
                            if (selected) ColorPrimary else Color.Black
                        )
                )
            }
        }
    }
}

@Composable
private fun AlbumCard(
    modifier: Modifier = Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        items(sampleAlbum) { albumItem ->
            Column(
                modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(18.dp))
                        .background(Color.DarkGray)
                ) {
                    AsyncImage(
                        model = albumItem.imageUrl,
                        contentDescription = albumItem.title,
                        modifier = Modifier.fillMaxWidth(),
                    )
                    Icon(
                        imageVector = Icons.Rounded.PlayArrow,
                        contentDescription = "Play",
                        tint = Color.White,
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .padding(10.dp)
                            .size(32.dp)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = albumItem.title,
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = albumItem.artist,
                    color = Color.Gray,
                    fontSize = 16.sp
                )
            }
        }
    }
}

private data class AlbumItem(
    val title: String,
    val artist: String,
    val imageUrl: String
)

private val sampleAlbum = listOf(
    AlbumItem(
        title = "Happier Than Ever",
        artist = "Billie Eilish",
        imageUrl = "https://picsum.photos/312/400?random=1"
    ),
    AlbumItem(
        title = "Billie Eilish",
        artist = "Armani White",
        imageUrl = "https://picsum.photos/312/400?random=2",
    ),
    AlbumItem(
        title = "Harry's House",
        artist = "Harry Styles",
        imageUrl = "https://picsum.photos/312/400?random=3",
    ),
    AlbumItem(
        title = "Happier Than Ever",
        artist = "Doja Cat",
        imageUrl = "https://picsum.photos/312/400?random=4",
    )
)

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
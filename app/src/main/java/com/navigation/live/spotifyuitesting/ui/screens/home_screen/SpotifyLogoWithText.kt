package com.navigation.live.spotifyuitesting.ui.screens.home_screen

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.navigation.live.spotifyuitesting.R

@Composable
fun SpotifyLogoWithText(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.spotify_logo_with_text),
        contentDescription = "Spotify logo with text",
        modifier = modifier
    )
}
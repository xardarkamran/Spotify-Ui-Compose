package com.navigation.live.spotifyuitesting.ui.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.navigation.live.spotifyuitesting.R

@Composable
fun SplashScreen(
    signup: () -> Unit,
    login: () -> Unit
) {
    SplashBackground {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Spacer(modifier = Modifier.height(17.dp))

            SplashLogo(modifier = Modifier.size(100.dp))

            Spacer(modifier = Modifier.height(50.dp))

            Text(
                text = "Million of Songs.\n Free on Spotify.",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
                color = Color.White,
                lineHeight = 32.sp
            )

            Spacer(modifier = Modifier.height(150.dp))

            SplashButtons(
                signup = signup,
                login = login
            )
        }
    }
}

@Composable
fun SplashBackground(content: @Composable BoxScope.() -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF666666), Color(0xFF000000))
                )
            )
            .padding(horizontal = 24.dp, vertical = 32.dp),
        content = content
    )
}

@Composable
fun SplashLogo(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.spotify_app_logo),
        contentDescription = "Splash logo",
        modifier = modifier
    )
}

@Composable
fun SplashButtons(
    signup: () -> Unit,
    login: () -> Unit
) {
    Button(
        onClick = signup,
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = Color.Black
        )
    ) {
        Text(
            text = "Sign up free"
        )
    }

    Spacer(modifier = Modifier.height(15.dp))

    OutlinedButton(
        onClick = login,
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = Color.Transparent
        )
    ) {
        Text(
            text = "Log in"
        )
    }

}

@Preview
@Composable
fun PreviewSplash() {
    SplashScreen({},{})
}
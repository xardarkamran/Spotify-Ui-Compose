package com.navigation.live.spotifyuitesting.ui.screens.login_in

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.navigation.live.spotifyuitesting.R
import com.navigation.live.spotifyuitesting.ui.shared.component.OutlinedButtonFilled
import com.navigation.live.spotifyuitesting.ui.shared.component.PrimaryButton
import com.navigation.live.spotifyuitesting.ui.shared.component.SpotifyLogo

@Composable
fun LoginScreen(
    onBack: () -> Unit = {},
    onEmailClick: () -> Unit = {},
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .windowInsetsPadding(WindowInsets(top = 30.dp))
    ) {
        IconButton(
            onClick = onBack
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "back icon",
                tint = Color.White
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Spacer(modifier = Modifier.height(90.dp))

            SpotifyLogo(modifier = Modifier.size(100.dp))

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Log in to Spotify",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(90.dp))

            PrimaryButton(
                text = "Continue with email",
                icon = R.drawable.dev_email_outline,
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = Color.Black
            ) { onEmailClick() }

            Spacer(modifier = Modifier.height(15.dp))

            OutlinedButtonFilled (
                text = "Continue with Google",
                icon = R.drawable.devicon_google,
                contentColor = Color.White
            ) { }

            Spacer(modifier = Modifier.height(15.dp))

            OutlinedButtonFilled(
                text = "Continue with Facebook",
                icon = R.drawable.logos_facebook,
                contentColor = Color.White
            ) { }

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Don't have an account?",
                fontSize = 14.sp,
                color = Color.LightGray
            )
            Text(
                text = "Sign up",
                fontSize = 14.sp,
                color = Color.White
            )

        }
    }
}

@Preview
@Composable
fun PreviewLoginScreen() {
    LoginScreen()
}
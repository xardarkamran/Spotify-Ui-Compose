package com.navigation.live.spotifyuitesting.ui.shared.component

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.navigation.live.spotifyuitesting.R

@Composable
fun SpotifyLogo(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.spotify_app_logo),
        contentDescription = "Spotify icon",
        modifier = modifier
    )
}
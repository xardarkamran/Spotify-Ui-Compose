package com.navigation.live.spotifyuitesting.ui.shared.utilz

import android.app.Activity
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.core.view.WindowCompat

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun TransparentSystemBar() {
    val activity = LocalContext.current as Activity
    SideEffect {

        val window = activity.window

        WindowCompat.setDecorFitsSystemWindows(window, false)

        // Transparent bars
        window.statusBarColor = Color.Transparent.toArgb()
        window.navigationBarColor = Color.Transparent.toArgb()

        // Ensure Transparency works cleanly
        window.isNavigationBarContrastEnforced = false
        window.isStatusBarContrastEnforced = false

        // Control icon colors
        WindowCompat.getInsetsController(window, window.decorView).apply {
            isAppearanceLightStatusBars = false
            isAppearanceLightNavigationBars = false
        }

    }
}
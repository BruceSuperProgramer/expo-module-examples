package expo.modules.video.context

import androidx.compose.runtime.staticCompositionLocalOf
import expo.modules.video.models.VideoUrlData

val LocalVideoViewModel = staticCompositionLocalOf<VideoUrlData> {
    error("No Chart ViewModel provided")
}

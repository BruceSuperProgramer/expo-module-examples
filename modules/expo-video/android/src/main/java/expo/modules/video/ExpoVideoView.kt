package expo.modules.video

import android.content.Context
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.ComposeView
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView
import expo.modules.video.components.VideoPlayer
import expo.modules.video.context.LocalVideoViewModel
import expo.modules.video.models.VideoUrlData

class ExpoVideoView(context: Context, appContext: AppContext) : ExpoView(context, appContext){
    val viewModel = VideoUrlData()

    internal val composeView = ComposeView(context).also {
        // add the compose view as a child
        it.layoutParams = LayoutParams(
            LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT,
        )
        it.setContent {
            CompositionLocalProvider(LocalVideoViewModel provides viewModel) { VideoPlayer() }
        }
        addView(it)
    }
}

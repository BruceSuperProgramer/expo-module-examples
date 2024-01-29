package expo.modules.video.components

import android.net.Uri
import android.widget.VideoView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import expo.modules.video.context.LocalVideoViewModel
import expo.modules.video.models.VideoUrlData
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun VideoPlayer(viewModel: VideoUrlData = viewModel()) {
    val viewModel: VideoUrlData = LocalVideoViewModel.current // Assuming this provides the necessary ViewModel instance.
    val url by viewModel.url.observeAsState(initial = "")

    AndroidView(
        factory = { ctx ->
            VideoView(ctx).apply {
                // Initial setup can be done here, if needed.
            }
        },
        modifier = Modifier.fillMaxSize(),
        update = { videoView ->
            videoView.setVideoURI(Uri.parse(url))
            videoView.setOnPreparedListener { mp ->
                mp.start() // Start playback as soon as the video is ready
            }
            videoView.requestFocus() // Optional, but can help with playback control focus
        }
    )
}
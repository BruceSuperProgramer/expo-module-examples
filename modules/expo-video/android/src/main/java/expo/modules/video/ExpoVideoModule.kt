package expo.modules.video

import VideoUrlRecord
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition
import expo.modules.video.models.VideoUrlData

class ExpoVideoModule : Module() {
  private var mainView: ExpoVideoView? = null
  override fun definition() = ModuleDefinition {
    Name("ExpoVideo")

    View(ExpoVideoView::class) {
      Prop("url") { view: ExpoVideoView, prop: String ->
        mainView = view;
        view.viewModel.updateUrl(prop)
      }
    }
  }
}

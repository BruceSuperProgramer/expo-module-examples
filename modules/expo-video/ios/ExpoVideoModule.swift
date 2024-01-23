import ExpoModulesCore

@available(iOS 14.0, *)
public class ExpoVideoModule: Module {
    private weak var mainView: ExpoVideoView?
    public func definition() -> ModuleDefinition {
        
        Name("ExpoVideo")
        
        View(ExpoVideoView.self) {
            Prop("url") { (view: ExpoVideoView, prop: String) in
                self.mainView = view
                view.viewModel.setUrl(prop)
            }
        }
    }
}

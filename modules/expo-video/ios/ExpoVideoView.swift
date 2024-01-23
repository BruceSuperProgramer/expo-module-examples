import ExpoModulesCore
import SwiftUI

@available(iOS 14.0, *)
class ExpoVideoView: ExpoView {
    var viewModel = VideoViewModel()
    let video = VideoView()

    required init(appContext: AppContext? = nil) {
        super.init(appContext: appContext)
        let hostingController = UIHostingController(rootView: video.environmentObject(viewModel));
        
        hostingController.view.translatesAutoresizingMaskIntoConstraints = false
        hostingController.view.backgroundColor = .clear
        
        addSubview(hostingController.view)
        NSLayoutConstraint.activate([
            hostingController.view.topAnchor.constraint(equalTo: self.topAnchor),
            hostingController.view.bottomAnchor.constraint(equalTo: self.bottomAnchor),
            hostingController.view.leftAnchor.constraint(equalTo: self.leftAnchor),
            hostingController.view.rightAnchor.constraint(equalTo: self.rightAnchor)
        ])
    }
    
}

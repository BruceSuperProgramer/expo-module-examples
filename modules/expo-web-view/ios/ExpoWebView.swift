import ExpoModulesCore
import SwiftUI

class ExpoWebView: ExpoView {
      required init(appContext: AppContext? = nil) {
        let hostingController = UIHostingController(rootView: WebView());

        super.init(appContext: appContext)

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

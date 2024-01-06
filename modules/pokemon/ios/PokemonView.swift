import ExpoModulesCore
import SwiftUI

class PokemonView: ExpoView {
    var viewModel = ViewModel()
    
    
    required init(appContext: AppContext? = nil) {
        super.init(appContext: appContext)
        let entryView = EntryView().environmentObject(viewModel)
        
        let hostingController = UIHostingController(rootView: entryView);
        
        
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

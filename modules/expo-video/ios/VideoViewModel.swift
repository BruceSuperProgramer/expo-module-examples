import SwiftUI

@available(iOS 13.0, *)
class VideoViewModel: ObservableObject {
    @Published var url =  ""
    
    func setUrl(_ url: String) {
        self.url = url
    }
}

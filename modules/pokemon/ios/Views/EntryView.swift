import SwiftUI
import UIKit
import ExpoModulesCore


struct EntryView: View {
    @EnvironmentObject var viewModel: ViewModel
    
    var body: some View {
        TabView {
            // 第一个标签页
            LandmarkList().environmentObject(viewModel)
                .tabItem {
                    Image(systemName: "house.fill")
                    Text("首页")
                }
            
            // 第二个标签页
            Text("设置")
                .tabItem {
                    Image(systemName: "gear")
                    Text("设置")
                }
        }
    }
}


//#Preview {
//    EntryView()
//}

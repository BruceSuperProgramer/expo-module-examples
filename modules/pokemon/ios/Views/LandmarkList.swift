import SwiftUI
import CoreData


struct LandmarkList: View {
    @EnvironmentObject var viewModel: ViewModel
    @State private var searchQuery = ""

    var body: some View {
        NavigationView {            
            List(viewModel.filteredItems) { landmark in
                NavigationLink {
                    LandmarkDetail(landmark: landmark)
                } label: {
                    LandmarkRow(landmark: landmark)
                }
            }
            .navigationTitle("Landmarks")
            .searchable(text: $searchQuery)
            .onChange(of: searchQuery) { newValue in
                            viewModel.filterItems(with: newValue)
                        }
        }
    }
}


//#Preview {
//    LandmarkList()
//}

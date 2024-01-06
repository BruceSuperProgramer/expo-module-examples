import SwiftUI

class ViewModel: ObservableObject {
    @Published var items: [Landmark] = []
    @Published var filteredItems: [Landmark] = []
    
    func setItems(_ data: [Landmark]) {
        items = data
        filteredItems = data
    }
    
    func deleteLastItem() {
        if !items.isEmpty {
            items.removeLast()
        }
        if !filteredItems.isEmpty {
            filteredItems.removeLast()
        }
    }
    
    func filterItems(with query: String) {
        if query.isEmpty {
            filteredItems = items
        } else {
            filteredItems = items.filter { $0.name.contains(query) }
        }
    }
}

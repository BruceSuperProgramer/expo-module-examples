import ExpoModulesCore
import CoreLocation
import SwiftUI

public class PokemonModule: Module {
    private weak var mainView: PokemonView?
    public func definition() -> ModuleDefinition {
        Name("Pokemon")
        
        View(PokemonView.self) {
            Prop("listData") { (view: PokemonView, prop: [LandmarkRecord]) in
                self.mainView = view
                
                let landmarks: [Landmark] = prop.map { record in
                    // Create a Landmark instance from each LandmarkRecord
                    return Landmark(
                        id: record.id,
                        name: record.name,
                        park: record.park,
                        state: record.state,
                        description: record.description,
                        imageName: record.imageName,
                        coordinates: Coordinates(latitude: Double(record.coordinates.latitude), longitude: Double(record.coordinates.longitude))
                    )
                }
                view.viewModel.setItems(landmarks)
            }
        }
        
        Function("deleteLastItem") { () in
            DispatchQueue.main.async {
                self.mainView?.viewModel.deleteLastItem()
            }
        }
    }
}

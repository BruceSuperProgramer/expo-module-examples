import Foundation
import SwiftUI
import CoreLocation
import ExpoModulesCore

struct CoordinatesRecord: Record {
    init() {
        latitude = 0.0
        longitude = 0.0
    }
    
    
    init(latitude: Double, longitude: Double) {
        self.latitude = latitude
        self.longitude = longitude
    }
    
    @Field
    var latitude: Double
    @Field
    var longitude: Double
}

struct LandmarkRecord: Record {
    init() {
        id = 0
        name = ""
        park = ""
        state = ""
        description = ""
        imageName = ""
        coordinates = CoordinatesRecord(latitude: 0.0, longitude: 0.0)
    }
    
    init(id: Int, name: String, park: String, state: String, description: String, imageName: String, coordinates: CoordinatesRecord) {
        self.id = id
        self.name = name
        self.park = park
        self.state = state
        self.description = description
        self.imageName = imageName
        self.coordinates = CoordinatesRecord(latitude: coordinates.latitude, longitude: coordinates.longitude)
    }
    
    @Field
    var id: Int
    
    @Field
    var name: String
    
    @Field
    var park: String
    
    @Field
    var state: String
    
    @Field
    var description: String
    
    @Field
    var imageName: String
    
    @Field
    var coordinates: CoordinatesRecord
    
    
    
    
}




import expo.modules.kotlin.records.Field
import expo.modules.kotlin.records.Record

class CoordinatesRecord: Record {
    @Field
    var latitude: Double = 0.0
    @Field
    var longitude: Double = 0.0
}

class LandmarkRecord: Record {
    @Field
    var id: Int = 0

    @Field
    var name: String = ""

    @Field
    var park: String = ""

    @Field
    var state: String = ""

    @Field
    var description: String = ""

    @Field
    var imageName: String = ""

    @Field
    var coordinates: CoordinatesRecord = CoordinatesRecord()
}
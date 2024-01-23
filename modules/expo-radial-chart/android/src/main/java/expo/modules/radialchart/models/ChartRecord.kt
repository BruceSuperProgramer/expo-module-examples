import expo.modules.kotlin.records.Field
import expo.modules.kotlin.records.Record

class ChartDataRecord: Record {
    @Field
    var x: String = "Mon"
    @Field
    var y: Int = 200
}


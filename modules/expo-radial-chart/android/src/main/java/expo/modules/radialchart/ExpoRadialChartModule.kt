package expo.modules.radialchart

import ChartDataRecord
import com.jaikeerthick.composable_graphs.composables.line.model.LineData
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class ExpoRadialChartModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("ExpoRadialChart")

        View(ExpoRadialChartView::class) {
            Prop("data") { view: ExpoRadialChartView, prop: Array<ChartDataRecord> ->
                val data = prop.map { record ->
                    LineData(record.x, record.y)
                }
                view.viewModel.updateData(data)
            }
        }
    }
}

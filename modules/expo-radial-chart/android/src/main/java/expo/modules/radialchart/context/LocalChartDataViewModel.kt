package expo.modules.pokemon.context

import androidx.compose.runtime.staticCompositionLocalOf
import expo.modules.radialchart.models.ChartData

val LocalChartDataViewModel = staticCompositionLocalOf<ChartData> {
    error("No Chart ViewModel provided")
}

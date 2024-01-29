package expo.modules.radialchart

import android.content.Context
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.ComposeView
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView
import expo.modules.pokemon.context.LocalChartDataViewModel
import expo.modules.radialchart.models.ChartData
import expo.modules.radialchart.screens.Home

class ExpoRadialChartView(context: Context, appContext: AppContext) :
    ExpoView(context, appContext) {
    val viewModel = ChartData()

    internal val composeView = ComposeView(context).also {
        // add the compose view as a child
        it.layoutParams = LayoutParams(
            LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT,
        )
        it.setContent {
            CompositionLocalProvider(LocalChartDataViewModel provides viewModel) { Home() }
        }
        addView(it)
    }
}


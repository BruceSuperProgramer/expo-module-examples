package expo.modules.radialchart.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jaikeerthick.composable_graphs.composables.line.LineGraph
import com.jaikeerthick.composable_graphs.composables.line.model.LineData
import expo.modules.pokemon.context.LocalChartDataViewModel
import expo.modules.radialchart.models.ChartData
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Home(viewModel: ChartData = viewModel()) {
    val viewModel = LocalChartDataViewModel.current
    val data by viewModel.data.observeAsState(initial = listOf())

    LineGraph(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 12.dp),
        data = data,
        onPointClick = { value: LineData ->
            // do something with value
        },
    )
}
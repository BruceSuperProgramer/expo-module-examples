package expo.modules.pokemon.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import expo.modules.pokemon.components.DrawerList
import expo.modules.pokemon.context.localLandMarksViewModel
import expo.modules.pokemon.models.LandMarks

@Composable
fun Home(viewModel: LandMarks = viewModel()) {
    val viewModel = localLandMarksViewModel.current
    val data by viewModel.data.observeAsState(initial = arrayOf())
    val firstDescription = data.firstOrNull()?.description ?: "No description available"

    DrawerList()
}
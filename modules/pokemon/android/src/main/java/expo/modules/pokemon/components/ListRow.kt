package expo.modules.pokemon.components

import LandmarkRecord
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import expo.modules.pokemon.context.localLandMarksViewModel
import expo.modules.pokemon.models.LandMarks
import getImageResource

@Composable
fun ListRow(data: LandmarkRecord, onClick: () -> Unit, viewModel: LandMarks = viewModel()) {
    val viewModel = localLandMarksViewModel.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                viewModel.setSelectedLandMark(data)
                onClick()
            },
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(id = getImageResource(data.imageName)),
            contentDescription = "Description for accessibility",
            modifier = Modifier.size(100.dp) // Keep the image square
        )
        Spacer(modifier = Modifier.width(16.dp)) // Add space between image and text
        Text(
            text = data.name,
            modifier = Modifier
                .align(Alignment.CenterVertically) // Align text vertically in the center
        )
    }
}
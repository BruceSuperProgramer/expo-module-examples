package expo.modules.pokemon.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.rememberCameraPositionState
import com.google.maps.android.compose.MapUiSettings

@Composable
fun MapCompose(latLng: LatLng) {
    // Create a state for CameraPosition that updates when latLng changes
    val cameraPosition = remember(latLng) {
        CameraPosition.fromLatLngZoom(latLng, 7f) // Adjust zoom as needed
    }

    // Create the CameraPositionState outside of remember to prevent composables in calculation block
    val cameraPositionState = rememberCameraPositionState {
        position = cameraPosition
    }

    LaunchedEffect(latLng) {
        try {
            cameraPositionState.move(CameraUpdateFactory.newCameraPosition(cameraPosition))
        } catch (e: Exception) {
            // Handle the exception appropriately, e.g., log or set an error state
            e.printStackTrace()
        }
    }

    GoogleMap(
        modifier = Modifier.fillMaxSize(),
        cameraPositionState = cameraPositionState,
        uiSettings = MapUiSettings(zoomControlsEnabled = false)
    ) {

    }
}
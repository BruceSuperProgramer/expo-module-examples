package expo.modules.pokemon.components

import CircledImage
import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.android.gms.maps.model.LatLng
import expo.modules.pokemon.context.localLandMarksViewModel
import expo.modules.pokemon.models.LandMarks
import getImageResource

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DrawerMainBody(viewModel: LandMarks = viewModel()) {
    val viewModel = localLandMarksViewModel.current
    val selectedLandMark by viewModel.selectedLandMark.observeAsState(initial = null)
    val scrollState = rememberScrollState()

    selectedLandMark?.let { landMark ->
        Column(modifier = Modifier.verticalScroll(scrollState)) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .height(225.dp)
            ) {
                MapCompose(
                    LatLng(
                        landMark.coordinates.latitude, landMark.coordinates.longitude
                    )
                )
            }
            Column(
                modifier = Modifier
                    .offset(y = (-125).dp)
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                CircledImage(
                    painterResource(id = getImageResource(landMark.imageName)), imageSize = 250
                )

                Column(modifier = Modifier.offset(y = 10.dp)) {
                    Text(
                        text = landMark.name,
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        ),
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = landMark.name,
                            style = TextStyle(
                                fontSize = 8.sp,
                                color = Color.Gray
                            ),
                        )
                        Text(
                            text = landMark.state,
                            style = TextStyle(
                                fontSize = 8.sp,
                                color = Color.Gray
                            ),
                        )
                    }
                    Divider(
                        color = Color.Gray,
                        thickness = 1.dp,
                    )

                    Column(modifier = Modifier.padding(top = 10.dp)) {
                        Text(
                            text = "About ${landMark.name}",
                            style = TextStyle(
                                fontSize = 18.sp,
                            ),
                        )
                        Text(
                            text = landMark.description,
                            style = TextStyle(
                                fontSize = 16.sp,
                            ),
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    }
                }
            }
        }
    }
}



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CircledImage(imagePainter: Painter, imageSize: Int) {
    Image(
        painter = imagePainter,
        contentDescription = null, // provide a description for accessibility
        modifier = Modifier
            .size(imageSize.dp)
            .clip(CircleShape), // Clip image to circle shape
        contentScale = ContentScale.Crop // Crop the image if necessary to fill the size
    )
}



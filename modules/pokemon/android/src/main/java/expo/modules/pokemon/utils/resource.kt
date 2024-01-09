import androidx.compose.ui.platform.LocalContext
import androidx.compose.runtime.Composable

@Composable
fun getImageResource(imageName: String): Int {
    val context = LocalContext.current
    return context.resources.getIdentifier(imageName, "drawable", context.packageName)
}
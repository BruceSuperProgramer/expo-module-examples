package expo.modules.pokemon.context

import androidx.compose.runtime.staticCompositionLocalOf
import expo.modules.pokemon.models.LandMarks

val localLandMarksViewModel = staticCompositionLocalOf<LandMarks> {
    error("No LandMarks ViewModel provided")
}

package expo.modules.pokemon.screens

import android.content.Context
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.ComposeView
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView
import expo.modules.pokemon.context.localLandMarksViewModel
import expo.modules.pokemon.models.LandMarks
import expo.modules.pokemon.navigations.BottomNavigation

class index(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    val viewModel = LandMarks()
    var bottomNavigation: Unit? = null

    internal val composeView = ComposeView(context).also {
        // add the compose view as a child
        it.layoutParams = LayoutParams(
            LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT,
        )
        it.setContent {
            bottomNavigation =
                CompositionLocalProvider(localLandMarksViewModel provides viewModel) { BottomNavigation() }
        }
        addView(it)
    }


}



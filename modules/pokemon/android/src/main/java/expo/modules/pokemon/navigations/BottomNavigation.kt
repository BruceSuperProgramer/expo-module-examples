package expo.modules.pokemon.navigations

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import expo.modules.pokemon.models.LandMarks
import expo.modules.pokemon.screens.Home
import expo.modules.pokemon.screens.Setting

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BottomNavigation() {
    val navController = rememberNavController()
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf(
        NavigationItem("首页", Icons.Filled.Home, "home"),
        NavigationItem("设置", Icons.Filled.Settings, "settings")
        // Add more items here
    )

    Scaffold(bottomBar = {
        BottomNavigation(backgroundColor = Color.White) {
            items.forEachIndexed { index, item ->
                BottomNavigationItem(icon = { Icon(item.icon, contentDescription = null) },
                    label = { Text(item.title) },
                    selected = selectedItem == index,
                    onClick = {
                        selectedItem = index
                        navController.navigate(item.route)
                    })
            }
        }
    }) {
        NavHost(navController, startDestination = items.first().route) {
            composable("home") { Home() }
            composable("settings") { Setting() }
        }
    }
}

data class NavigationItem(val title: String, val icon: ImageVector, val route: String)

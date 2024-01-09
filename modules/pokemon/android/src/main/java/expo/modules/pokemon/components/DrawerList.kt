package expo.modules.pokemon.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import expo.modules.pokemon.context.localLandMarksViewModel
import expo.modules.pokemon.models.LandMarks
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DrawerList(viewModel: LandMarks = viewModel()) {
    val viewModel = localLandMarksViewModel.current
    val data by viewModel.data.observeAsState(initial = arrayOf())

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val focusManager = LocalFocusManager.current

    var searchText by remember { mutableStateOf("") }

    val onListItemClick: () -> Unit = {
        coroutineScope.launch {
            scaffoldState.drawerState.close()
        }
    }

    LaunchedEffect(scaffoldState.drawerState) {
        snapshotFlow { scaffoldState.drawerState.isOpen }.collect { isOpen ->
            if (!isOpen) {
                // If the drawer is closed, hide the keyboard
                focusManager.clearFocus()
            }
        }
    }
    Scaffold(scaffoldState = scaffoldState, topBar = {
        TopAppBar(title = { Text("Land Mark") }, navigationIcon = {
            IconButton(onClick = {
                coroutineScope.launch {
                    scaffoldState.drawerState.open()
                }
            }) {
                Icon(Icons.Filled.Menu, contentDescription = "Menu")
            }
        })
    }, drawerContent = {
        Column(modifier = Modifier.padding(start = 10.dp, bottom = 56.dp)) {
            OutlinedTextField(value = searchText,
                onValueChange = {
                    searchText = it
                    viewModel.filterData(searchText)
                },
                label = { Text("Search") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                singleLine = true,
                leadingIcon = {
                    Icon(Icons.Filled.Search, contentDescription = "Search Icon")
                })
            Spacer(modifier = Modifier.height(8.dp))
            LazyColumn {
                items(data) { item ->
                    ListRow(data = item, onClick = onListItemClick)
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }

    }) {
        DrawerMainBody()
    }


}
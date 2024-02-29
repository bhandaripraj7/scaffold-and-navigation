// Screen.kt
package com.example.scaffoldandnavigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController


@Composable
fun HomeScreen() {
    Scaffold(
        topBar = { MainTopBar(title = "My App") }
    ) { innerPadding ->
        Text("Content for Home screen", modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun InfoScreen(navController: NavController) {
    Scaffold(
        topBar = { ScreenTopBar(title = "Info", navController = navController) }
    ) { innerPadding ->
        Text("Content for Info screen", modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun SettingsScreen(navController: NavController) {
    Scaffold(
        topBar = { ScreenTopBar(title = "Settings", navController = navController) }
    ) { innerPadding ->
        Text("Content for Settings screen", modifier = Modifier.padding(innerPadding))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(title: String) {
    CenterAlignedTopAppBar(
        title = { Text(text = title) }
        // If you want to add actions, you can add them here
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenTopBar(title: String, navController: NavController) {
    CenterAlignedTopAppBar(
        title = { Text(text = title) },
        navigationIcon = {
            IconButton(onClick = { navController.navigateUp() }) {
                Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
            }

        }
        // If you want to add actions, you can add them here
    )
}
package com.datamate.mycomposebottomnav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.datamate.mycomposebottomnav.components.ContactsScreen
import com.datamate.mycomposebottomnav.components.HomeScreen
import com.datamate.mycomposebottomnav.components.SettingsScreen
import com.datamate.mycomposebottomnav.navigation.*
import com.datamate.mycomposebottomnav.ui.theme.MyComposeBottomNavTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeBottomNavTheme {
                MyApp()
            }
        }
    }
}
@Composable
fun MyApp() {
    val navController = rememberNavController()
    val modifier = Modifier
    Scaffold(
        bottomBar = { AppBottomBar(navController) }
    ) {
        Box(
            modifier = modifier
                .padding(it)
        ) {
            NavHost(
                navController = navController,
                startDestination = Home.route,
            ) {
                composable(Home.route) {
                    HomeScreen()
                }
                composable(Settings.route) {
                    SettingsScreen()
                }
                composable(Contacts.route) {
                    ContactsScreen()
                }
            }
        }
    }
}

@Composable
fun AppBottomBar(navController: NavController = rememberNavController()) {
    val backstack = navController.currentBackStackEntryAsState()
    NavigationBar {
        bottomNabBarItems.forEach { item ->
            val selectedItem = item.route == backstack.value?.destination?.route
            NavigationBarItem(
                selected = selectedItem,
                onClick = { navController.navigate(item.route) },
                icon = { Icon(imageVector = item.icon, contentDescription = "${item.icon}") },
            )
        }
    }
}
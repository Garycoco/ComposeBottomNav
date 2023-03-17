package com.datamate.mycomposebottomnav.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination

interface AppDestinations {
    val route: String
}
object Home: AppDestinations {
    override val route: String
        get() = "Home"
}
object Settings: AppDestinations {
    override val route: String
        get() = "Settings"
}
object Contacts: AppDestinations {
    override val route: String
        get() = "Contacts"
}

class AppNavigationActions(navController: NavController) {
    val navigateToHome: () -> Unit = {
        navController.navigate(Home.route) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
    val navigateToContacts: () -> Unit = {
        navController.navigate(Contacts.route) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
    val navigateSettings: () -> Unit = {
        navController.navigate(Settings.route) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
}
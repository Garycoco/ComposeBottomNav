package com.datamate.mycomposebottomnav.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val name: String,
    val route: String,
    val icon: ImageVector
)

val bottomNabBarItems = listOf(
    BottomNavItem(
        name = "Home",
        route = Home.route,
        icon = Icons.Rounded.Home
    ),
    BottomNavItem(
        name = "Settings",
        route = Settings.route,
        icon = Icons.Rounded.Settings
    ),
    BottomNavItem(
        name = "Contacts",
        route = Contacts.route,
        icon = Icons.Rounded.Phone
    )
)

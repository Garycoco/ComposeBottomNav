package com.datamate.mycomposebottomnav.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val name: String,
    val route: String,
    val icon: ImageVector,
    val selectedIcons: ImageVector
)

val bottomNabBarItems = listOf(
    BottomNavItem(
        name = "Home",
        route = Home.route,
        icon = Icons.Outlined.Home,
        selectedIcons = Icons.Filled.Home
    ),
    BottomNavItem(
        name = "Settings",
        route = Settings.route,
        icon = Icons.Outlined.Settings,
        selectedIcons = Icons.Filled.Settings
    ),
    BottomNavItem(
        name = "Contacts",
        route = Contacts.route,
        icon = Icons.Outlined.Phone,
        selectedIcons = Icons.Filled.Phone
    )
)

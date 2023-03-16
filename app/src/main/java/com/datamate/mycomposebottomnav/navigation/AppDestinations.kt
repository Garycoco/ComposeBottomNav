package com.datamate.mycomposebottomnav.navigation

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
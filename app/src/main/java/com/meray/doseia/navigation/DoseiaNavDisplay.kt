package com.meray.doseia.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.meray.doseia.customers.CustomersScreen
import kotlinx.serialization.Serializable

@Serializable
internal data object Home : NavKey

@Composable
internal fun DoseiaNavDisplay(modifier: Modifier = Modifier) {
    val backStack = rememberNavBackStack(Home)

    NavDisplay(
        backStack = backStack,
        modifier = modifier,
        entryProvider = entryProvider {
            entry<Home> {
                CustomersScreen(modifier)
            }
        }
    )
}

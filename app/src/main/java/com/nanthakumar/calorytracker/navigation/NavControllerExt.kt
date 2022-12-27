package com.nanthakumar.calorytracker.navigation

import androidx.navigation.NavController
import com.nanthakumar.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}
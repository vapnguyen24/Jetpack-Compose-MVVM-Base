package com.example.myapplication.feature.presentation.home

import androidx.lifecycle.ViewModel
import com.example.myapplication.feature.navigation.base.RouteNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val routeNavigator: RouteNavigator
) : ViewModel(), RouteNavigator by routeNavigator {
}
package com.mikeschvedov.spacex.ui

import androidx.lifecycle.ViewModel
import com.mikeschvedov.spacex.utils.helper_classes.LiveInternetChecker
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val liveInternetChecker: LiveInternetChecker
): ViewModel() {


}
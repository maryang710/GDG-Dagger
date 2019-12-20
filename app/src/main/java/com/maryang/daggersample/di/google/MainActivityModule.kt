package com.maryang.daggersample.di.google

import com.maryang.daggersample.ui.main.MainActivity
import com.maryang.daggersample.ui.main.MainView
import dagger.Module
import dagger.Provides


@Module
class MainActivityModule(
    private val activity: MainActivity
) {
    @Provides
    fun mainActivity(): MainActivity = activity

    @Provides
    fun mainView(activity: MainActivity): MainView = activity
}

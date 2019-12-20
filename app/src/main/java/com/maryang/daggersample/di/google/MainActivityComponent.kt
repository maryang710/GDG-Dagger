package com.maryang.daggersample.di.google

import com.maryang.daggersample.ui.main.MainActivity
import dagger.Subcomponent


@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent {
    fun inject(activity: MainActivity)
}

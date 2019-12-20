package com.maryang.daggersample.di.google

import dagger.Component


@Component
interface AppComponent {
    fun mainActivity(module: MainActivityModule): MainActivityComponent
}

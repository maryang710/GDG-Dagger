package com.maryang.daggersample

import android.app.Application
import com.maryang.daggersample.di.google.DaggerAppComponent


class BaseApplication : Application() {

//    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
//        return DaggerAppComponent.builder().application(this).build()
//    }

    // Reference to the application graph that is used across the whole app
    val appComponent = DaggerAppComponent.create()
}

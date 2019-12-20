package com.maryang.daggersample.ui.main

import android.os.Bundle
import com.maryang.daggersample.BaseApplication
import com.maryang.daggersample.R
import com.maryang.daggersample.di.google.MainActivityModule
import com.maryang.daggersample.ui.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity<MainPresenter>(), MainView {

    @Inject
    override lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as BaseApplication).appComponent
            .mainActivity(MainActivityModule(this))
            .inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

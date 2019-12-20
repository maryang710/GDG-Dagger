package com.maryang.daggersample.ui.base

import androidx.appcompat.app.AppCompatActivity


abstract class RootActivity : AppCompatActivity()

abstract class BaseActivity<out T : BasePresenter<*>> : RootActivity(), BaseView {
    abstract val presenter: T
}

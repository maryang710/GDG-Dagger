package com.maryang.daggersample.ui.base


abstract class BasePresenter<out T : BaseView>(
    protected val view: T
)

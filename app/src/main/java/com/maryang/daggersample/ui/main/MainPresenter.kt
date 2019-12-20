package com.maryang.daggersample.ui.main

import com.maryang.daggersample.ui.base.BasePresenter
import javax.inject.Inject


class MainPresenter @Inject constructor(
    view: MainView
) : BasePresenter<MainView>(view)

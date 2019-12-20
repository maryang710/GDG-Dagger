package com.maryang.daggersample.entity

import com.maryang.daggersample.entity.engine.Engine

class Car(
    private val engine: Engine
//    private val battery: Battery,
//    private val handle: Handle,
//    private val padel: Padel,
//    private val brake: Brake,
//    private val radiator: Radiator
) {
    // Short Code

    fun start() {
        engine.start()
    }
}

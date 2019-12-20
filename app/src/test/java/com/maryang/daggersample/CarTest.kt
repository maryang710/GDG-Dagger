package com.maryang.daggersample

import com.maryang.daggersample.entity.Car
import com.maryang.daggersample.entity.engine.FakeEngine
import com.maryang.daggersample.entity.engine.FakeFailEngine
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CarTest {
    @Test
    fun carTest() {
        Car(FakeEngine())
    }

    @Test
    fun carTest_fail() {
        Car(FakeFailEngine())
    }
}

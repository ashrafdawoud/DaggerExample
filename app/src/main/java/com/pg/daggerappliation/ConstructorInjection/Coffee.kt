package com.pg.daggerappliation.ConstructorInjection

import android.util.Log
import javax.inject.Inject

class Coffee @Inject constructor(private val farm: Farm,private val river: River) {
    @Inject
    fun runelectricuty(){
        Log.e("runhere","runuing one time")
    }
}
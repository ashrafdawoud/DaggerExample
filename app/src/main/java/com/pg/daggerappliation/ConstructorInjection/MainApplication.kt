package com.pg.daggerappliation.ConstructorInjection

import android.app.Application

class MainApplication : Application() {
    private lateinit var componnent: CoffeComponnent
    override fun onCreate() {
        super.onCreate()
        componnent = DaggerCoffeComponnent.builder().sugarquantity(4).milkQuantitty(5).build1()
    }
        fun getcomponnent(): CoffeComponnent {
            return componnent
        }

}




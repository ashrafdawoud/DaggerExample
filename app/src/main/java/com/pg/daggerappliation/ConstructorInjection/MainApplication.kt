package com.pg.daggerappliation.ConstructorInjection

import android.app.Application

class MainApplication : Application() {
    private lateinit var componnent: AppComponent
    override fun onCreate() {
        super.onCreate()
        componnent = DaggerAppComponent.create()
    }
        fun getcomponnent(): AppComponent {
            return componnent
        }

}




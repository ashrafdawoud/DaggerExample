package com.pg.daggerappliation.ConstructorInjection.Module

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class SugarModule {

    @Provides
    fun getsugar():Sugar{
        Log.e("sugarmodule","module")
        return Sugar()
    }
}
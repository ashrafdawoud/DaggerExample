package com.pg.daggerappliation.ConstructorInjection.Module

import android.util.Log
import com.pg.daggerappliation.ConstructorInjection.Annotation.CoffeAnnotation
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SugarModule {
    @Singleton
    @Provides
    fun getsugar():Sugar{
        Log.e("sugarmodule","module")
        return Sugar()
    }
}
package com.pg.daggerappliation.ConstructorInjection

import com.pg.daggerappliation.ConstructorInjection.Module.SugarModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [SugarModule::class])
interface AppComponent {
    fun getCoffeBulder():CoffeComponnent.Builder
}
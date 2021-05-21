package com.pg.daggerappliation.ConstructorInjection

import com.pg.daggerappliation.ConstructorInjection.Annotation.MilkQuantity
import com.pg.daggerappliation.ConstructorInjection.Annotation.SugarQuantity
import com.pg.daggerappliation.ConstructorInjection.Module.SugarModule
import com.pg.daggerappliation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component (modules = [SugarModule::class])
 interface CoffeComponnent {
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun sugarquantity(@SugarQuantity sugarquantity:Int ):Builder
        @BindsInstance
        fun milkQuantitty(@MilkQuantity milkQuantitty:Int):Builder

        fun build1():CoffeComponnent
    }
}
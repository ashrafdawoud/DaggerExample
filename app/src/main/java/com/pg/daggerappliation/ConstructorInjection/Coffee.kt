package com.pg.daggerappliation.ConstructorInjection

import android.util.Log
import com.pg.daggerappliation.ConstructorInjection.Annotation.CoffeAnnotation
import com.pg.daggerappliation.ConstructorInjection.Annotation.MilkQuantity
import com.pg.daggerappliation.ConstructorInjection.Annotation.SugarQuantity
import com.pg.daggerappliation.ConstructorInjection.Module.Sugar
import com.pg.daggerappliation.ConstructorInjection.Module.SugarModule
import javax.inject.Inject
@CoffeAnnotation
class Coffee @Inject constructor(private val farm1: Farm, private val river1: River, private val Sugar1: Sugar, @SugarQuantity val sugarQuantitty: Int, @MilkQuantity val milkQuantitty: Int) {
    val farm = this.farm1
        get() {
            return field
        }
    val river = this.river1
        get() {
            return field
        }
    val Sugar = this.Sugar1
        get() {
            return field
        }


    @Inject
    fun runelectricuty() {
        Log.e("runhere", "$sugarQuantitty + \" : \" + $milkQuantitty")
    }

}
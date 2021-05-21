package com.pg.daggerappliation.ConstructorInjection

import android.util.Log
import com.pg.daggerappliation.ConstructorInjection.Annotation.MilkQuantity
import com.pg.daggerappliation.ConstructorInjection.Annotation.SugarQuantity
import com.pg.daggerappliation.ConstructorInjection.Module.Sugar
import javax.inject.Inject

class Coffee @Inject constructor(private val farm1: Farm, private val river: River, private val Sugar:Sugar, @SugarQuantity val sugarQuantitty: Int,@MilkQuantity val milkQuantitty: Int) {
    val farm =this.farm1
    get() {return field}

    @Inject
    fun runelectricuty(){
        Log.e("runhere", "$sugarQuantitty + \" : \" + $milkQuantitty" )
    }

}
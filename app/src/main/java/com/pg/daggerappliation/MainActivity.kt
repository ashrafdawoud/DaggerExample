package com.pg.daggerappliation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pg.daggerappliation.ConstructorInjection.CoffeComponnent
import com.pg.daggerappliation.ConstructorInjection.Coffee
import com.pg.daggerappliation.ConstructorInjection.MainApplication
import dagger.Component
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var coffee:Coffee
    @Inject
    lateinit var coffee2:Coffee
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /////////////construcot injection//////////////////
        val component=(application as MainApplication).getcomponnent()
        val coffeComponnent:CoffeComponnent=component.getCoffeBulder().milkQuantitty(4).sugarquantity(5).build1()
        coffeComponnent.inject(this)
        Log.e("scopetest","${coffee.farm}"+"  "+"${coffee2.farm}+${coffee}"+"  "+"${coffee2}"+"${coffee.Sugar}"+"${coffee2.Sugar}")

    }


}
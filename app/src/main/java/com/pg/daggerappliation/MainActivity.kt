package com.pg.daggerappliation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pg.daggerappliation.ConstructorInjection.CoffeComponnent
import com.pg.daggerappliation.ConstructorInjection.DaggerCoffeComponnent
import dagger.Component

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /////////////construcot injection//////////////////
        val component=DaggerCoffeComponnent.create()
        component.getcoffee()
    }


}
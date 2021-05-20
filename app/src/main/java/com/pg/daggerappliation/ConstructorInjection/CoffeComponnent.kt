package com.pg.daggerappliation.ConstructorInjection

import dagger.Component

@Component
public interface CoffeComponnent {
    fun getcoffee():Coffee
}
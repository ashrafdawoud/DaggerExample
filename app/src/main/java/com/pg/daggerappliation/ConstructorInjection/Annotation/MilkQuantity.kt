package com.pg.daggerappliation.ConstructorInjection.Annotation

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class MilkQuantity(
    /** The name.  */
    val value: String = "MilkQuantity"
)
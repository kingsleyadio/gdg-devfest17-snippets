@file:Suppress("RedundantGetter", "RedundantSetter", "unused", "ObjectPropertyName")

package com.example.gdgdevfest17

object ValMagic {

    private fun performExpensiveCalculation(): List<Recipe> = TODO()

    val expensiveRecipes: List<Recipe> get() = performExpensiveCalculation()

    val eagerRecipes: List<Recipe> = performExpensiveCalculation()

    val lazyRecipes: List<Recipe> by lazy { performExpensiveCalculation() }
}


fun main(args: Array<String>) = with(ValMagic) {
    println(expensiveRecipes) // could return different instances on different invocations
    println(eagerRecipes)
    println(lazyRecipes)
}


object VarMagic {

    var myVal = "Valerie"

    var myValObvious = "Valerie"
        get() = field
        set(value) {
            field = value
        }


    private var _hookupDay: String? = null

    var myValTricky: String
        get() = _hookupDay ?: "Saturday"
        set(value) {
            _hookupDay = value
        }
}

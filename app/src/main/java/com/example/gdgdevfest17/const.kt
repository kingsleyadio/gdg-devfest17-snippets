@file:Suppress("unused", "PropertyName", "PrivatePropertyName")

package com.example.gdgdevfest17

val PUBLIC_VAL = 1111
private val PRIVATE_VAL = 1111
@JvmField val JVM_FIELD_VAL = 1111
const val CONST_VAL = 1111


class ConstMagic {

    fun doStuff() {
        println(PUBLIC_VAL) // generates getter :((
        println(PRIVATE_VAL) // generates accessor :(
        println(JVM_FIELD_VAL) // cannot be made private
        println(CONST_VAL) // inlined just as we want it :)
    }
}

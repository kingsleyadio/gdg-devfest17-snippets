@file:Suppress("unused", "ObjectLiteralToLambda", "UseExpressionBody", "PropertyName", "UNUSED_PARAMETER")

package com.example.gdgdevfest17

class MyConstants {
    companion object {
        var MY_VAR = "Valerie"
        const val VAL_DAY = "February 14"
    }
}

object MyConstantsBetter {
    var MY_VAR = "Valerie"
    const val VAL_DAY = "February 14"
}

var MY_VAR = "Valerie"
const val VAL_DAY = "February 14"


interface ExceptionHandler {
    fun handleFailure(throwable: Throwable)
}

fun doWork(exceptionHandler: ExceptionHandler): Unit = TODO()


class MagicClass {
    // Do some magical stuff

    private fun doStuff() {
        doWork(exceptionHandler)
    }

    companion object {

        val exceptionHandler = object : ExceptionHandler {
            override fun handleFailure(throwable: Throwable) {
                println("An error occurred. $throwable")
            }
        }
    }
}

class MagicClassBetter {
    // Do some magical stuff

    private fun doStuff() {
        doWork(SimpleExceptionHandler)
        doWork(MagicClassBetter)
    }

    companion object SimpleExceptionHandler : ExceptionHandler {
        override fun handleFailure(throwable: Throwable) {
            println("An error occurred. $throwable")
        }
    }
}


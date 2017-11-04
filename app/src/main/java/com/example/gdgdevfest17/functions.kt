@file:Suppress("unused", "UseExpressionBody")

package com.example.gdgdevfest17

val simpleArray = listOf(
        "Kingsley",
        "Valerie",
        "Dorothea",
        "Julia",
        "Lizzy"
)

fun printStuff(printer: (String) -> Unit) {
    simpleArray.forEach(printer)
}

inline fun printStuffInlined(printer: (String) -> Unit) {
    simpleArray.forEach(printer)
}


fun main(args: Array<String>) {

    printStuff { stuff -> println(stuff) }

    printStuffInlined { stuff -> println(stuff) }
}



typealias PrintHandler = (item: String) -> Unit

class ComplexClass(val printer: PrintHandler)


fun newComplexClass(
        printer: (String) -> Unit
): ComplexClass {
    return ComplexClass(printer)
}

inline fun newComplexClassInlined(
        noinline printer: (String) -> Unit
): ComplexClass {
    return ComplexClass(printer)
}

inline fun newComplexClassInlinedAnotherAttempt(
        crossinline printer: (String) -> Unit
): ComplexClass {

    return ComplexClass(object: PrintHandler {
        override fun invoke(item: String) {
            printer(item)
        }
    })
}

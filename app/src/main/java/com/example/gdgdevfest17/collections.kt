package com.example.gdgdevfest17

fun main(args: Array<String>) {

    val simpleArray = arrayOf(
            "Kingsley",
            "Valerie",
            "Dorothea",
            "Julia",
            null,
            "Lizzy")

    val arrayLength = simpleArray.size
    val almightyList = List(100) { index -> simpleArray[index % arrayLength] }

    almightyList
            .filterNotNull()
            .filter { !it.startsWith("K") }
            .map { it.toUpperCase() }
            .distinct()
            .forEach(::println)


    almightyList
            .asSequence()
            .filterNotNull()
            .filter { !it.startsWith("K") }
            .map { it.toUpperCase() }
            .distinct()
            .forEach(::println)


    almightyList.last()

    almightyList.asSequence().last()

}

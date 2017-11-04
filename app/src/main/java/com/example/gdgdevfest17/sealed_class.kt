@file:Suppress("unused", "UNUSED_PARAMETER")

package com.example.gdgdevfest17

sealed class Intention {

    class Refresh : Intention()

    class LoadMore : Intention()
}

fun peekIntent(): Intention = Intention.LoadMore()


fun main1(args: Array<String>) {
    val intention = peekIntent()

    val output = when (intention) {
        is Intention.Refresh -> "refresh"
        is Intention.LoadMore -> "load more"
    }
    println(output)
}



sealed class CacheResult<out T> {

    class Hit<out T>(val item: T): CacheResult<T>()

    object Miss: CacheResult<Nothing>()
}

fun fetchRecipeFromCache(recipeId: String): CacheResult<Recipe> = TODO()


fun main(args: Array<String>) {
    val cacheResult = fetchRecipeFromCache("someId")

    when (cacheResult) {
        is CacheResult.Hit -> println(cacheResult.item.description)
        CacheResult.Miss -> println("Cache miss!")
    }
}

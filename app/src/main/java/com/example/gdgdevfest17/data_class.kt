@file:JvmName("DataClassUtil")
@file:Suppress("unused", "UNUSED_VARIABLE")

package com.example.gdgdevfest17

data class Recipe(
        val id: String,
        val name: String,
        val imageUrl: String,
        val ratingsCount: Int,
        val averageRating: Float,
        val description: String,
        val headline: String,
        val tags: List<String>,
        val author: String?,
        val country: String
)

fun newRecipe(): Recipe = TODO()


fun main(args: Array<String>) {

    val recipe = newRecipe()

    val (recipeId, recipeName, recipeImage) = recipe
}

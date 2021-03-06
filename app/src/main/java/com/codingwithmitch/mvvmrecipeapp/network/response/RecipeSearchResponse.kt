package com.codingwithmitch.mvvmrecipeapp.network.response

import com.codingwithmitch.mvvmrecipeapp.network.model.RecipeEntity
import com.google.gson.annotations.SerializedName

class RecipeSearchResponse(

    @SerializedName("count")
    var count: Int,

    @SerializedName("recipes")
    var recipes: List<RecipeEntity>,
)




package br.com.petz.di.data.network.response

import com.google.gson.annotations.SerializedName

data class DogProfile(
    val name: String,
    val breed: String,
    val genre: String,

    @SerializedName("human_parents")
    val humanParents: String,
    val image: String
)

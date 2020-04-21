package br.com.petz.di.data.network.response

import com.google.gson.annotations.SerializedName

data class Pokemon(
    @SerializedName("name")
    val name: String,

    @SerializedName("height")
    val height: String,

    @SerializedName("weight")
    val weight: String
)
package br.com.petz.di.data.network.response

import com.google.gson.annotations.SerializedName

data class GetNameResponse(
    @SerializedName("name") val name: String
)
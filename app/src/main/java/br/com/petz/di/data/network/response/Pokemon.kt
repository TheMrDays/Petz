package br.com.petz.di.data.network.response

import com.google.gson.annotations.SerializedName

data class Pokemon(
    val name: String,
    val weight: String,
    @SerializedName("base_experience")
    val baseExperience: String,
    val moves: List<Moves>
)

data class Moves (
    val move: Move
)

data class Move(
    val name: String
) {

}

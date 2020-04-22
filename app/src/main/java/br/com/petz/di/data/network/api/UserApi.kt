package br.com.petz.di.data.network.api

import br.com.petz.di.data.network.response.Pokemon
import retrofit2.Call
import retrofit2.http.GET

interface UserApi {

    @GET("api/v2/pokemon/3")
    fun getPokemon(): Call<Pokemon>
}


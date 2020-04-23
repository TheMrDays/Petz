package br.com.petz.di.data.network.api

import br.com.petz.di.data.network.response.DogProfile
import retrofit2.http.GET

interface DogProfileApi {

    @GET("profile/")
    suspend fun getDogProfile(): DogProfile
}


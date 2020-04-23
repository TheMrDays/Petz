package br.com.petz.di.data.repository

import br.com.petz.di.data.network.response.DogProfile

interface DogRepository {

    suspend fun getDogProfile(): DogProfile

}
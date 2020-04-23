package br.com.petz.di.data.repository

import br.com.petz.di.data.network.api.DogProfileApi
import javax.inject.Inject

class DogRepositoryImpl @Inject constructor(
    private val dogProfileApi: DogProfileApi
) : DogRepository {

    override suspend fun getDogProfile() = dogProfileApi.getDogProfile()

}
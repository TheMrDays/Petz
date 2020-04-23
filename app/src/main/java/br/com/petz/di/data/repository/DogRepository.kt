package br.com.petz.di.data.repository

import androidx.lifecycle.LiveData
import br.com.petz.di.data.network.response.DogProfile

interface DogRepository {

    fun getDogProfile(): LiveData<DogProfile>

}
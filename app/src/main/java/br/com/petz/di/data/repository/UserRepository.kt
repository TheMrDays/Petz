package br.com.petz.di.data.repository

import androidx.lifecycle.LiveData
import br.com.petz.di.data.network.response.Pokemon

interface UserRepository {

    fun getPokemon(): LiveData<Pokemon>

}
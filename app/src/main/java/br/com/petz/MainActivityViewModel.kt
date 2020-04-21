package br.com.petz

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LiveData
import androidx.lifecycle.OnLifecycleEvent
import br.com.petz.common.BaseViewModel
import br.com.petz.di.data.network.response.Pokemon
import br.com.petz.di.data.repository.UserRepositoryImpl


class MainActivityViewModel constructor(
    val userRepository: UserRepositoryImpl
) : BaseViewModel() {

    val pokemon: LiveData<Pokemon> = userRepository.getPokemon()

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {

    }


}


package br.com.petz.ui

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LiveData
import androidx.lifecycle.OnLifecycleEvent
import br.com.petz.common.BaseViewModel
import br.com.petz.di.data.network.response.DogProfile
import br.com.petz.di.data.repository.DogRepositoryImpl


class MainActivityViewModel constructor(
    private val userRepository: DogRepositoryImpl
) : BaseViewModel() {

    val dogProfile: LiveData<DogProfile> = userRepository.getDogProfile()

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {

    }


}


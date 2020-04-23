package br.com.petz.ui

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.liveData
import br.com.petz.common.BaseViewModel
import br.com.petz.di.data.repository.DogRepositoryImpl
import kotlinx.coroutines.Dispatchers


class MainActivityViewModel constructor(
    private val userRepository: DogRepositoryImpl
) : BaseViewModel() {

    //val dogProfile: LiveData<DogProfile> = userRepository.getDogProfile()

    val dogProfile = liveData(Dispatchers.IO){
        val getDogProfile = userRepository.getDogProfile()

        emit(getDogProfile)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {

    }


}


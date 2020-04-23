package br.com.petz.base.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.petz.ui.MainActivityViewModel
import br.com.petz.di.data.repository.DogRepositoryImpl

class MainViewModelFactory(private val userRepository: DogRepositoryImpl) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
    if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
        return MainActivityViewModel(userRepository) as T
    }
        throw IllegalArgumentException("Unknown view model")
    }

}
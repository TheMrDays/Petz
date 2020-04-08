package br.com.petz

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.OnLifecycleEvent
import br.com.petz.common.BaseViewModel

class MainActivityViewModel : BaseViewModel() {

    val name = MutableLiveData<String>()

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {

        name.postValue("Marinho")

    }

}
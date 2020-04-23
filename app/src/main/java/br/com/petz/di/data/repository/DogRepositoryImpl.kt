package br.com.petz.di.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import br.com.petz.di.data.network.api.DogProfileApi
import br.com.petz.di.data.network.response.DogProfile
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber
import javax.inject.Inject

class DogRepositoryImpl @Inject constructor(
    private val dogProfileApi: DogProfileApi
) : DogRepository {

    override fun getDogProfile(): LiveData<DogProfile> {
        val dogProfile = MutableLiveData<DogProfile>()

        dogProfileApi.getDogProfile().enqueue(object : Callback<DogProfile> {
            override fun onResponse(call: Call<DogProfile>, response: Response<DogProfile>) {
                if (response.isSuccessful) {
                    dogProfile.value = response.body()
                }
            }

            override fun onFailure(call: Call<DogProfile>, t: Throwable) {
                Timber.e(t)
            }
        })

        return dogProfile
    }

}
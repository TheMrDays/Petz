package br.com.petz.di.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import br.com.petz.di.data.network.api.UserApi
import br.com.petz.di.data.network.response.Pokemon
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userApi: UserApi
) : UserRepository {

    override fun getPokemon(): LiveData<Pokemon> {
        val pokemon = MutableLiveData<Pokemon>()

        userApi.getPokemon().enqueue(object : Callback<Pokemon> {
            override fun onResponse(call: Call<Pokemon>, response: Response<Pokemon>) {
                if (response.isSuccessful) {
                    pokemon.value = response.body()
                }
            }

            override fun onFailure(call: Call<Pokemon>, t: Throwable) {
                Timber.e(t)
            }
        })

        return pokemon
    }

}
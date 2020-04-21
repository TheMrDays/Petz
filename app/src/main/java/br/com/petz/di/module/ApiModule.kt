package br.com.petz.di.module

import br.com.petz.di.data.network.api.UserApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class ApiModule {

    @Provides
    fun providesNameApi(retrofit: Retrofit): UserApi =
        retrofit.create(UserApi::class.java)

}
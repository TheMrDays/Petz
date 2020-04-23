package br.com.petz.di.module

import br.com.petz.di.data.network.api.DogProfileApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class DogApiModule {

    @Provides
    fun providesDogProfileApi(retrofit: Retrofit): DogProfileApi =
        retrofit.create(DogProfileApi::class.java)

}
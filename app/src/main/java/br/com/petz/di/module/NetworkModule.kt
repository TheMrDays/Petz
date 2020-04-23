package br.com.petz.di.module

import br.com.petz.BuildConfig
import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun providesBaseUrl() = checkNotNull(HttpUrl.parse(BuildConfig.BASE_URL)) { "BASE_URL is null" }

//    @Singleton
//    @Provides
//    fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor) =
//        OkHttpClient.Builder()
//            .addInterceptor(loggingInterceptor)
//            .build()

    @Singleton
    @Provides
    fun providesRetrofit(httpUrl: HttpUrl) =
        Retrofit.Builder()
            .baseUrl(httpUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


}
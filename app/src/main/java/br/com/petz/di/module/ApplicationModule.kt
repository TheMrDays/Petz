package br.com.petz.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ApplicationModule(
    private val context: Context
) {

    @Singleton
    @Provides
    fun provideContext() = context

}

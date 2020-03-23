package br.com.petz.di.module

import br.com.petz.MainActivity
import br.com.petz.PetzApp
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector


@Module
abstract class AppModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}


@Module
class ActivityModule {

    @Provides
    fun provideContext() = PetzApp().baseContext

}
package br.com.petz.di.module

import br.com.petz.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [DogApiModule::class])
    abstract fun bindMainActivity(): MainActivity

}
package br.com.petz.di.component


import br.com.petz.PetzApp
import br.com.petz.di.module.ActivityModule
import br.com.petz.di.module.AppModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityModule::class

    ]
)
interface AppComponent : AndroidInjector<PetzApp>
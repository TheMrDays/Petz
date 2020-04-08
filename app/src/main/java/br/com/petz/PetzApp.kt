package br.com.petz

import android.app.Application
import br.com.petz.di.component.ApplicationComponent
import br.com.petz.di.component.DaggerApplicationComponent
import br.com.petz.di.module.ApplicationModule
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class PetzApp : Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>
    override fun androidInjector() = androidInjector

    private val application: ApplicationComponent by lazy {
        DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        application.inject(this)

    }

}
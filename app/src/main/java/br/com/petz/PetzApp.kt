package br.com.petz

import android.app.Application
import br.com.petz.di.component.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class PetzApp : Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector() = androidInjector

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.create().inject(this)

    }

}
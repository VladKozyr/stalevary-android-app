package com.vlad.kozyr.customer_app

import android.app.Application
import com.vlad.kozyr.customer_app.core.di.authModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin
import timber.log.Timber

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(authModule)
        }
        Timber.plant(Timber.asTree())
    }
}
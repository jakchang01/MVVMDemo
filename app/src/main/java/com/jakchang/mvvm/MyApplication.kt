package com.jakchang.mvvm

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber


@HiltAndroidApp
class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        myApp = this
        Timber.plant(Timber.DebugTree())
    }

    companion object {
        var myApp: MyApplication? = null

    }
}
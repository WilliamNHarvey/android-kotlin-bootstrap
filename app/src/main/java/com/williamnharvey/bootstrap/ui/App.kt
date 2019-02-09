package com.williamnharvey.bootstrap.ui

import android.app.Application
import com.williamnharvey.bootstrap.extensions.DelegatesExt

class App : Application() {

    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}
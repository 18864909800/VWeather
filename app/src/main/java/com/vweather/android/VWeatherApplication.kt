package com.vweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class VWeatherApplication : Application() {
    companion object {
        const val TOKEN = "hLqA6ujJn2wE4Pu4"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}
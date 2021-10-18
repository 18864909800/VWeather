package com.vweather.android.logic.network

import com.vweather.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=$(VWeatherApplication.TOKEN&lang=zh_CN")
    fun searchPlaces(@Query("quare")query:String): Call<PlaceResponse>
}
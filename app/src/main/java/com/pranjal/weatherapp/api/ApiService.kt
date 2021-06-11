package com.pranjal.weatherapp.api

import com.pranjal.weatherapp.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/Curitiba")
    suspend fun getWeather() :Response<Weather>
}
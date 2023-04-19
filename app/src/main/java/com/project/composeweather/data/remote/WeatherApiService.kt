package com.project.composeweather.data.remote

import com.project.composeweather.data.model.WeatherDto
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    //https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current_weather=true&hourly=temperature_2m,relativehumidity_2m,windspeed_10m

    @GET("v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl")
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") lon: Double
    ): WeatherDto
}
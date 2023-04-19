package com.project.composeweather.domain.repository

import com.project.composeweather.domain.util.Resource
import com.project.composeweather.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(
        lat: Double,
        lon: Double
    ): Resource<WeatherInfo>
}
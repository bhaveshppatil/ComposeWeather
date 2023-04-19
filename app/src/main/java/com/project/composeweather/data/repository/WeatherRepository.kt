package com.project.composeweather.data.repository

import com.project.composeweather.data.mappers.toWeatherInfo
import com.project.composeweather.data.remote.WeatherApiService
import com.project.composeweather.domain.repository.WeatherRepository
import com.project.composeweather.domain.util.Resource
import com.project.composeweather.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val apiService: WeatherApiService
) : WeatherRepository {

    override suspend fun getWeatherData(lat: Double, lon: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = apiService.getWeatherData(lat, lon).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred")
        }
    }
}
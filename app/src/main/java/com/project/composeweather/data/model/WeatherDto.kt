package com.project.composeweather.data.model

import com.project.composeweather.data.model.WeatherDataDto
import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)

package com.project.composeweather.domain.weather

data class WeatherInfo(
    val perDayWeatherData: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
) {
}
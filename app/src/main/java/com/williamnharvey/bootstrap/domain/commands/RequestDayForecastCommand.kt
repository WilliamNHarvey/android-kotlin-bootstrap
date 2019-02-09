package com.williamnharvey.bootstrap.domain.commands

import com.williamnharvey.bootstrap.domain.datasource.ForecastProvider
import com.williamnharvey.bootstrap.domain.model.Forecast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RequestDayForecastCommand(
        val id: Long,
        private val forecastProvider: ForecastProvider = ForecastProvider()) :
        Command<Forecast> {

    override suspend fun execute() = withContext(Dispatchers.IO) {
        forecastProvider.requestForecast(id)
    }
}
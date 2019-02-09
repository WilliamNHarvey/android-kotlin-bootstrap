package com.williamnharvey.bootstrap.domain.datasource

import com.williamnharvey.bootstrap.domain.model.Forecast
import com.williamnharvey.bootstrap.domain.model.ForecastList

interface ForecastDataSource {

    fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList?

    fun requestDayForecast(id: Long): Forecast?

}
package com.alexisjardin.horoscapp.data

import android.util.Log
import com.alexisjardin.horoscapp.data.network.HoroscopeApiService
import com.alexisjardin.horoscapp.domain.Repository
import com.alexisjardin.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImp @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("alx", "a ocurrido un error ${it.message}") }
        return null
    }

}
package com.alexisjardin.horoscapp.domain

import com.alexisjardin.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}
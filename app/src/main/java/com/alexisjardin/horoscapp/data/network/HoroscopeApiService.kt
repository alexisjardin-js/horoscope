package com.alexisjardin.horoscapp.data.network

import com.alexisjardin.horoscapp.data.network.response.PredictionResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface HoroscopeApiService {
    @GET("/{sign}/")

    suspend fun getHoroscope(
        @Path("sign") sign:String,
        @Query("lang") lang:String = "es"
    ):PredictionResponse
}
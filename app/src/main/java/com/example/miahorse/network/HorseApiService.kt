package com.example.miahorse.network

import com.example.miahorse.network.data.Contents
import com.example.miahorse.network.data.Horse
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

private const val BASE_URL = "https://3edv1pafh2.microcms.io/api/v1/"
private val retrofit = Retrofit.Builder()
    .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
    .baseUrl(BASE_URL)
    .build()

interface HorseApiService {

    @Headers("X-MICROCMS-API-KEY: 0EQX1HwGZYhHxtWQTJlS1KHAhACyZfjl05U0")
    @GET("photos")
    suspend fun getPhotos(): Contents
}

object HorseApi {
    val horseApiService: HorseApiService by lazy {
        retrofit.create()
    }
}
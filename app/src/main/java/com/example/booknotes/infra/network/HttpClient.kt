package com.example.booknotes.infra.network

import com.example.booknotes.infra.network.interceptors.ApiKeyInterceptor
import com.example.booknotes.shared.EnvManager
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HttpClient {
    private val baseURL = "googleapis.com/books/v1/volumes"
    private val apiKey = EnvManager().getApiKey()
    var clientApi: Retrofit? = null

    operator fun invoke() {
        buildClient()
    }


  private fun buildClient() {
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(ApiKeyInterceptor(apiKey))
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(baseURL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        clientApi = retrofit
    }

}
package com.example.booknotes.app.searchbooks.api

import com.example.booknotes.app.searchbooks.domain.model.response.BooksApiResponse
import com.example.booknotes.infra.network.ResponseHandler
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface BooksAPI {
    @GET("volumes")
    suspend fun searchBooks(
        @Query("q") query: String
    ): Response<ResponseHandler<BooksApiResponse>>
}
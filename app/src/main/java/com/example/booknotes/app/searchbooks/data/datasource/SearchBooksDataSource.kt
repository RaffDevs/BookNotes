package com.example.booknotes.app.searchbooks.data.datasource

import com.example.booknotes.app.searchbooks.data.entities.GoogleBookEntity
import com.example.booknotes.app.searchbooks.domain.model.enums.SearchBooksTags
import com.example.booknotes.app.searchbooks.domain.model.response.BooksApiResponse
import com.example.booknotes.infra.network.ResponseHandler
import retrofit2.Response


interface SearchBooksDataSource {
    suspend fun getBookBy(by: SearchBooksTags, value: String):ResponseHandler<BooksApiResponse>

    suspend fun getBooksByTerms(terms: List<String>): ResponseHandler<BooksApiResponse>
}
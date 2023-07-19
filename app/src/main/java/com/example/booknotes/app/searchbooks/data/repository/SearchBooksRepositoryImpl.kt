package com.example.booknotes.app.searchbooks.data.repository

import com.example.booknotes.app.searchbooks.data.datasource.SearchBooksDataSource
import com.example.booknotes.app.searchbooks.data.entities.GoogleBookEntity
import com.example.booknotes.app.searchbooks.domain.model.enums.SearchBooksTags
import com.example.booknotes.app.searchbooks.domain.model.response.BooksApiResponse
import com.example.booknotes.infra.network.ResponseHandler
import retrofit2.Response
import javax.inject.Inject

class SearchBooksRepositoryImpl @Inject constructor(
    private val datasource: SearchBooksDataSource
) : SearchBooksRepository {
    override suspend fun getBookBy(
        tab: SearchBooksTags,
        value: String
    ): ResponseHandler<BooksApiResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun getBooksByTerms(terms: List<String>): ResponseHandler<BooksApiResponse> {
        TODO("Not yet implemented")
    }
}
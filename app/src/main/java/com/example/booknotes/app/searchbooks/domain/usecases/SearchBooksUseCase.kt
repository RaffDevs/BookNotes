package com.example.booknotes.app.searchbooks.domain.usecases

import com.example.booknotes.app.searchbooks.data.entities.GoogleBookEntity
import com.example.booknotes.app.searchbooks.domain.model.enums.SearchBooksTags
import com.example.booknotes.infra.network.ResponseHandler

interface SearchBooksUseCase {
    suspend fun getBookBy(
        tab: SearchBooksTags,
        value: String
    ): ResponseHandler<List<GoogleBookEntity>>

    suspend fun getBooksByTerms(terms: List<String>): ResponseHandler<List<GoogleBookEntity>>
}
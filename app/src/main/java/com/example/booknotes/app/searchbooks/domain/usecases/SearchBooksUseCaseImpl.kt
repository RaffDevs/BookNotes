package com.example.booknotes.app.searchbooks.domain.usecases

import com.example.booknotes.app.searchbooks.data.entities.GoogleBookEntity
import com.example.booknotes.app.searchbooks.data.repository.SearchBooksRepository
import com.example.booknotes.app.searchbooks.domain.model.enums.SearchBooksTags
import com.example.booknotes.infra.network.ResponseHandler
import javax.inject.Inject

class SearchBooksUseCaseImpl @Inject constructor(
    private val repository: SearchBooksRepository
): SearchBooksUseCase {
    override suspend fun getBookBy(
        tab: SearchBooksTags,
        value: String
    ): ResponseHandler<List<GoogleBookEntity>> {
        TODO("Not yet implemented")
    }

    override suspend fun getBooksByTerms(terms: List<String>): ResponseHandler<List<GoogleBookEntity>> {
        TODO("Not yet implemented")
    }
}
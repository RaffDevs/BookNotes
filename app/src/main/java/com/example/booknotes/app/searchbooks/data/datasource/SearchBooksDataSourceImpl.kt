package com.example.booknotes.app.searchbooks.data.datasource

import android.util.Log
import com.example.booknotes.app.searchbooks.api.BooksAPI
import com.example.booknotes.app.searchbooks.data.entities.GoogleBookEntity
import com.example.booknotes.app.searchbooks.domain.model.enums.SearchBooksTags
import com.example.booknotes.app.searchbooks.domain.model.response.BooksApiResponse
import com.example.booknotes.infra.network.ResponseHandler
import retrofit2.Response
import java.lang.Exception
import javax.inject.Inject

class SearchBooksDataSourceImpl @Inject constructor(
    private val booksAPI: BooksAPI
) : SearchBooksDataSource {
    override suspend fun getBookBy(
        by: SearchBooksTags,
        value: String
    ): ResponseHandler<BooksApiResponse> {
        val queryString = "${by.value}:${value}"

        try {
            val response = booksAPI.searchBooks(queryString)

            if (response.isSuccessful) {
                val body = response.body()
                return if (body !== null) {
                    body
                } else {
                    ResponseHandler.Error(
                        "Houve um erro na requisição ${response.errorBody()}"
                    )
                }
            }
        } catch (e: Exception) {
            Log.d("Exception on getBooks", "${e.localizedMessage}")
        }

        return ResponseHandler.Error("Erro desconhecido ocorreu")

    }

    override suspend fun getBooksByTerms(terms: List<String>): ResponseHandler<BooksApiResponse> {
        TODO("Not yet implemented")
    }
}
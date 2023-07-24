package com.example.booknotes.app.searchbooks.di

import com.example.booknotes.app.searchbooks.api.BooksAPI
import com.example.booknotes.app.searchbooks.data.datasource.SearchBooksDataSource
import com.example.booknotes.app.searchbooks.data.datasource.SearchBooksDataSourceImpl
import com.example.booknotes.app.searchbooks.data.repository.SearchBooksRepository
import com.example.booknotes.app.searchbooks.data.repository.SearchBooksRepositoryImpl
import com.example.booknotes.app.searchbooks.domain.usecases.SearchBooksUseCase
import com.example.booknotes.app.searchbooks.domain.usecases.SearchBooksUseCaseImpl
import com.example.booknotes.infra.network.HttpClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SearchBooksModule {
    @Singleton
    @Provides
    fun provideBooksAPI(): BooksAPI {
        val httpClient = HttpClient()
        return httpClient.clientApi!!.create(BooksAPI::class.java)
    }

    @Singleton
    @Provides
    fun provideSearchBooksRepository(api: BooksAPI): SearchBooksRepository {
        return SearchBooksRepositoryImpl(api)
    }

    @Singleton
    @Provides
    fun provideSearchBooksUseCase(repository: SearchBooksRepository): SearchBooksUseCase {
        return SearchBooksUseCaseImpl(repository)
    }

}
package com.example.booknotes.app.searchbooks.domain.model.response

import com.example.booknotes.app.searchbooks.data.entities.GoogleBookEntity

data class BooksApiResponse(
    val kind: String,
    val totalItems: Int,
    val items: List<GoogleBookEntity>
)

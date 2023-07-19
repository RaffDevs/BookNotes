package com.example.booknotes.app.searchbooks.domain.model.enums

enum class SearchBooksTags(val value: String?) {
    ISBN(value = "isbn"),
    TITLE(value = "intitle"),
    AUTHOR(value = "inauthor"),
    PUBLISHER(value = "inpublisher"),
}
package com.example.booknotes.infra.network

import java.lang.Exception

sealed class ResponseHandler<out T>{
    data class Success<out T>(val data: T): ResponseHandler<T>()
    data class Error(val errorMessage: String): ResponseHandler<Nothing>()
    data class Exception(val exception: java.lang.Exception)
}

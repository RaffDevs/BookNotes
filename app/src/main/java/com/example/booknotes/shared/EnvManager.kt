package com.example.booknotes.shared

import io.github.cdimascio.dotenv.Dotenv

class EnvManager {
    private var dotenv: Dotenv? = null

    operator fun invoke() {
        dotenv = Dotenv.load()
    }

    fun getApiKey(): String {
        return dotenv?.get("API_KEY") ?: ""
    }
}
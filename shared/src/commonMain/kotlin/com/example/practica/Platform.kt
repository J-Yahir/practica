package com.example.practica

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package com.example.lushopos

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
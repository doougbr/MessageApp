package com.example.messageapp.model


data class Contacts(
    val name: String,
    val nickname: String,
    val photo: String,
    val number: Long,
    val category: String,
    val important: Boolean
)

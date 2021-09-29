package com.example.messageapp.contacts.model


data class Contacts(
    val name: String,
    val nickname: String,
    val photoUrl: String?,
    val number: Long,
    val category: String,
    val important: Boolean = false
)

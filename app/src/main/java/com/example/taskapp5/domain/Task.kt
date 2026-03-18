package com.example.taskapp5.domain

data class Task(
    val id: Long,
    val title: String,
    val completed: Boolean = false
)

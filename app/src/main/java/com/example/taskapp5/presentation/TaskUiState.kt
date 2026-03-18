package com.example.taskapp5.presentation

import com.example.taskapp5.domain.Task

sealed class TaskUiState {
    data object Loading : TaskUiState()
    data class Success(val tasks: List<Task>) : TaskUiState()
    data class Error(val message: String) : TaskUiState()
}

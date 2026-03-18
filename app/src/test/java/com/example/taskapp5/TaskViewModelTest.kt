package com.example.taskapp5

import com.example.taskapp5.data.FakeTaskRepository
import com.example.taskapp5.presentation.TaskUiState
import com.example.taskapp5.presentation.TaskViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class TaskViewModelTest {

    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()

    private lateinit var fakeRepo: FakeTaskRepository
    private lateinit var viewModel: TaskViewModel

    @Before
    fun setUp() {
        fakeRepo = FakeTaskRepository()
        viewModel = TaskViewModel(fakeRepo)
    }

    @Test
    fun `carga de tareas produce estado Success con datos del repositorio`() = runTest {
        // Al inicializarse el ViewModel ya llama a loadTasks()
        val state = viewModel.uiState.value
        assertTrue(state is TaskUiState.Success)
        assertEquals(4, (state as TaskUiState.Success).tasks.size)
    }
}

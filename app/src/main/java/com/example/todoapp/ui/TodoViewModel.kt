package com.example.todoapp.ui

import androidx.lifecycle.ViewModel
import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.example.todoapp.data.TodoEntity
import com.example.todoapp.data.TodoRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class TodoViewModel @Inject constructor(
    private val todoRepository: TodoRepository
): ViewModel() {

    private val _todoList = MutableStateFlow<List<TodoEntity>>(emptyList())
    val todoList = _todoList.asStateFlow()

    init {
        getTodo()
    }

    private fun getTodo() {

    }
}
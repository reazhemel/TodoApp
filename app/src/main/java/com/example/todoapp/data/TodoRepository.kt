package com.example.todoapp.data

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TodoRepository @Inject constructor(
   private val todoDao: TodoDao
) {
    suspend fun insertTodoTask(todoEntity: TodoEntity) {
        todoDao.insertTodoTask(todoEntity)
    }

    fun getTodoList(): Flow<List<TodoEntity>> {
        return todoDao.getTodoList()
    }
}
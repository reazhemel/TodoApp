package com.example.todoapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {

    @Insert
    suspend fun insertTodoTask(todoEntity: TodoEntity)

    @Query("SELECT * FROM todo_table")
    fun getTodoList(): Flow<List<TodoEntity>>
}
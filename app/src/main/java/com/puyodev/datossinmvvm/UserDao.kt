package com.puyodev.datossinmvvm

import androidx.room.Insert
import androidx.room.Query

interface UserDao {
    @Query("SELECT * FROM User")
    suspend fun getAll(): List<User>

    @Insert
    suspend fun insert(user: User)
}
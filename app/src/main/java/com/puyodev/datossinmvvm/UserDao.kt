package com.puyodev.datossinmvvm

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Query("SELECT * FROM User")
    suspend fun getAll(): List<User>

    @Insert
    suspend fun insert(user: User)

    // Para eliminar al último usuario añadido
    @Query("DELETE FROM user WHERE uid = (SELECT MAX(uid) FROM user)")
    suspend fun deleteLastUser()
}


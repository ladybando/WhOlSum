package com.example.android.wholsum.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
abstract class UserDao : BaseDao<User> {
    @Query("SELECT * FROM users")
    abstract fun getUsers(): List<User>

}

interface BaseDao<T>{
    @Insert
    fun insert(vararg obj: T)

    @Delete
    fun deleteItem(vararg obj: T)
}
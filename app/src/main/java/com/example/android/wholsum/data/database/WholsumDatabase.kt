package com.example.android.wholsum.data.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class WholsumDatabase : RoomDatabase() {
    abstract fun userDao() : UserDao
}
package com.example.android.wholsum.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey val userId: Int,
    val userName: String,
    val firstName: String,
    val lastName: String,
    val email: String
)

data class UserMinimal(
    val userName: String,
    val firstName: String,
    val lastName: String
)
package com.beyonda.githubbrowser.common.data.cache.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class CachedUser(
    val login: String,
    @PrimaryKey
    val id: Int,
    val avatarUrl: String,
    val reposUrl: String
)
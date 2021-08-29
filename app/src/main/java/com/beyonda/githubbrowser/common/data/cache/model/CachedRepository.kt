package com.beyonda.githubbrowser.common.data.cache.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "repositories")
data class CachedRepository(
    @PrimaryKey
    val id: Int,
    val name: String,
    val fullName: String,
    val description: String,
    val url: String
)
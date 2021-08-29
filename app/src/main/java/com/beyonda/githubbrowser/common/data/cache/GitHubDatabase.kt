package com.beyonda.githubbrowser.common.data.cache

import androidx.room.Database
import androidx.room.RoomDatabase
import com.beyonda.githubbrowser.common.data.cache.dao.GitHubDao
import com.beyonda.githubbrowser.common.data.cache.model.CachedRepository
import com.beyonda.githubbrowser.common.data.cache.model.CachedUser

@Database(
    entities = [
        CachedUser::class,
        CachedRepository::class
    ],
    version = 1
)


abstract class GitHubDatabase : RoomDatabase() {

    abstract fun gitHubDao(): GitHubDao
}
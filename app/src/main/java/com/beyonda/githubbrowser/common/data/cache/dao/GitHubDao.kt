package com.beyonda.githubbrowser.common.data.cache.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Transaction
import com.beyonda.githubbrowser.common.data.cache.model.CachedRepository
import com.beyonda.githubbrowser.common.data.cache.model.CachedUser
import io.reactivex.Flowable

@Dao
abstract class GitHubDao {

    @Transaction
    @Query("SELECT * FROM users ORDER BY id DESC")
    abstract fun getAllUsers(): Flowable<List<CachedUser>>

    @Transaction
    @Query("SELECT * FROM repositories ORDER BY id DESC")
    abstract fun getAllRepositories(): Flowable<List<CachedRepository>>

    @Insert(onConflict = REPLACE)
    abstract suspend fun insertUser(
    user: CachedUser
    )

    @Insert(onConflict = REPLACE)
    abstract suspend fun insertRepository(
    repository: CachedRepository
    )

    suspend fun insertUsers(users: List<CachedUser>) {
        for (user in users) {
            insertUser(user)
        }
    }

    suspend fun insertRepositories(repositories: List<CachedRepository>) {
        for (repository in repositories) {
            insertRepository(repository)
        }
    }


}
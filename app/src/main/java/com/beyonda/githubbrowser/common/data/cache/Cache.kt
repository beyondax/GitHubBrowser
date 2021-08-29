package com.beyonda.githubbrowser.common.data.cache

import com.beyonda.githubbrowser.common.data.cache.model.CachedRepository
import com.beyonda.githubbrowser.common.data.cache.model.CachedUser
import com.beyonda.githubbrowser.domain.model.Repository
import io.reactivex.Flowable

interface Cache {

    fun getUsers(): Flowable<List<CachedUser>>

    suspend fun storeUsers(users: List<CachedUser>)

    suspend fun storeUser(user: CachedUser)

    fun getRepositories(): Flowable<List<CachedRepository>>

    suspend fun storeRepositories(repositories: List<CachedRepository>)

    suspend fun storeRepository(repository: CachedRepository)
}
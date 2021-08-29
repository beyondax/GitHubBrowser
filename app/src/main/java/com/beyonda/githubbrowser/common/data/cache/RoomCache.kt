package com.beyonda.githubbrowser.common.data.cache

import com.beyonda.githubbrowser.common.data.cache.dao.GitHubDao
import com.beyonda.githubbrowser.common.data.cache.model.CachedRepository
import com.beyonda.githubbrowser.common.data.cache.model.CachedUser
import com.beyonda.githubbrowser.domain.model.Repository
import io.reactivex.Flowable
import javax.inject.Inject

class RoomCache @Inject constructor(
    private val gitHubDao: GitHubDao
) : Cache {
    override fun getUsers(): Flowable<List<CachedUser>> {
       return gitHubDao.getAllUsers()
    }

    override suspend fun storeUsers(users: List<CachedUser>) {
        gitHubDao.insertUsers(users)
    }

    override suspend fun storeUser(user: CachedUser) {
        gitHubDao.insertUser(user)
    }

    override fun getRepositories(): Flowable<List<CachedRepository>> {
       return gitHubDao.getAllRepositories()
    }

    override suspend fun storeRepositories(repositories: List<CachedRepository>) {
        gitHubDao.insertRepositories(repositories)
    }

    override suspend fun storeRepository(repository: CachedRepository) {
        gitHubDao.insertRepository(repository)
    }
}
package com.beyonda.githubbrowser.domain.repository

import com.beyonda.githubbrowser.domain.model.User
import io.reactivex.Flowable

interface GitHubRepository {
    fun getUsers() : Flowable<List<User>>
    suspend fun storeUsers(users: List<User>)
}
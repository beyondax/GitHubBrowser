package com.beyonda.githubbrowser.data.api

import com.beyonda.githubbrowser.data.api.model.ApiRepository
import com.beyonda.githubbrowser.data.api.model.ApiUser
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GitHubApi {

    @GET(ApiConstants.BASE_URL_USERS)
    suspend fun getUser(
        @Path(ApiConstants.USER) user: String
    ) : ApiUser


    @GET(ApiConstants.BASE_URL_USERS)
    suspend fun getUsers() : List<ApiUser>

    @GET(ApiConstants.BASE_URL_REPOSITORIES)
    suspend fun getRepository(
        @Path(ApiConstants.REPOSITORY) repository: Int
    ) : ApiRepository

    @GET(ApiConstants.BASE_URL_REPOSITORIES)
    suspend fun getRepositories() : List<ApiRepository>
}
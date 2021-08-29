package com.beyonda.githubbrowser.data.api.model.mappers

import com.beyonda.githubbrowser.data.api.model.ApiUser
import com.beyonda.githubbrowser.domain.model.User

class ApiUserMapper : ApiMapper<ApiUser, User> {
    override fun mapToDomain(apiEntity: ApiUser): User {
       return User(
           login = apiEntity.login.orEmpty(),
           id = apiEntity.id ?: throw MappingException("User ID cannot be null"),
           avatarUrl = apiEntity.avatarUrl.orEmpty(),
           reposUrl = apiEntity.reposUrl.orEmpty()
       )
    }
}
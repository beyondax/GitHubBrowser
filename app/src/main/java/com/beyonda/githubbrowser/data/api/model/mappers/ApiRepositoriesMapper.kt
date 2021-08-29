package com.beyonda.githubbrowser.data.api.model.mappers

import com.beyonda.githubbrowser.data.api.model.ApiRepository
import com.beyonda.githubbrowser.domain.model.Repository

class ApiRepositoriesMapper : ApiMapper<ApiRepository, Repository> {
    override fun mapToDomain(apiEntity: ApiRepository): Repository {
        return Repository(
            id = apiEntity.id ?: throw MappingException("Repository ID cannot be null"),
            name = apiEntity.name.orEmpty(),
            full_name = apiEntity.full_name.orEmpty(),
            description = apiEntity.description.orEmpty(),
            url = apiEntity.url.orEmpty()
        )
    }
}
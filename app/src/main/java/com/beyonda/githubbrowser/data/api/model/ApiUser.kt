package com.beyonda.githubbrowser.data.api.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiUser(
    @field:Json(name = "login") val login: String?,
    @field:Json(name = "id") val id: Int?,
    @field:Json(name = "avatarUrl") val avatarUrl: String?,
    @field:Json(name = "reposUrl") val reposUrl: String?
)

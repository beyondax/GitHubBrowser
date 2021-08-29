package com.beyonda.githubbrowser.data.api.model

import com.beyonda.githubbrowser.domain.model.User
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiRepository(
    @field:Json(name = "id") val id: Int?,
    @field:Json(name = "name") val name: String?,
    @field:Json(name = "full_name") val full_name: String?,
    @field:Json(name = "description") val description: String?,
    @field:Json(name = "url") val url: String?
)

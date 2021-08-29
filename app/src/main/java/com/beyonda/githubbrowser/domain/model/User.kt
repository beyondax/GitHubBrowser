package com.beyonda.githubbrowser.domain.model

data class User(
    val login: String,
    val id: Int,
    val avatarUrl: String,
    val reposUrl: String,
)
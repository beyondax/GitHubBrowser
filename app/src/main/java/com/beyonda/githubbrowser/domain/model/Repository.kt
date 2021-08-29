package com.beyonda.githubbrowser.domain.model

data class Repository (
    val id: Int,
    val name: String,
    val full_name: String,
    val description: String,
    val url: String,
    )
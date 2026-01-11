package com.sahil.movies.domain.model

data class TitleDetails(
    val id: Int,
    val title: String,
    val overview: String?,
    val releaseDate: String?,
    val year: Int?,
    val runtimeMinutes: Int?,
    val genres: List<String>?,
    val rating: Double?,
    val poster: String?,
    val backdrop: String?,
    val networks: List<String>?,
    val language: String?,
    val type: String?
)

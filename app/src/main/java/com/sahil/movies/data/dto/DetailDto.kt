package com.sahil.movies.data.dto

import com.google.gson.annotations.SerializedName
import com.sahil.movies.domain.model.TitleDetails

data class TitleDetailsDto(
    val id: Int,
    val title: String,

    @SerializedName("original_title")
    val originalTitle: String?,

    @SerializedName("plot_overview")
    val plotOverview: String?,

    val type: String?,

    @SerializedName("runtime_minutes")
    val runtimeMinutes: Int?,

    val year: Int?,

    @SerializedName("end_year")
    val endYear: Int?,

    @SerializedName("release_date")
    val releaseDate: String?,

    @SerializedName("imdb_id")
    val imdbId: String?,

    @SerializedName("tmdb_id")
    val tmdbId: Int?,

    @SerializedName("tmdb_type")
    val tmdbType: String?,

    val genres: List<Int>?,

    @SerializedName("genre_names")
    val genreNames: List<String>?,

    @SerializedName("user_rating")
    val userRating: Double?,

    @SerializedName("critic_score")
    val criticScore: Int?,

    @SerializedName("us_rating")
    val usRating: String?,

    val poster: String?,

    @SerializedName("posterMedium")
    val posterMedium: String?,

    @SerializedName("posterLarge")
    val posterLarge: String?,

    val backdrop: String?,

    @SerializedName("original_language")
    val originalLanguage: String?,

    @SerializedName("similar_titles")
    val similarTitles: List<Int>?,

    val networks: List<Int>?,

    @SerializedName("network_names")
    val networkNames: List<String>?,

    @SerializedName("relevance_percentile")
    val relevancePercentile: Double?,

    @SerializedName("popularity_percentile")
    val popularityPercentile: Double?,

    val trailer: String?,

    @SerializedName("trailer_thumbnail")
    val trailerThumbnail: String?
)


fun TitleDetailsDto.toDomain(): TitleDetails {
    return TitleDetails(
        id = id,
        title = title,
        overview = plotOverview,
        releaseDate = releaseDate,
        year = year,
        runtimeMinutes = runtimeMinutes,
        genres = genreNames,
        rating = userRating,
        poster = posterLarge ?: posterMedium ?: poster,
        backdrop = backdrop,
        networks = networkNames,
        language = originalLanguage,
        type = tmdbType
    )
}
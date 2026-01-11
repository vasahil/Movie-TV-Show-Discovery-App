package com.sahil.movies.data.api


import com.sahil.movies.data.dto.TitleDetailsDto
import com.sahil.movies.data.dto.TitleResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WatchModeApi {

    @GET("list-titles/")
    fun getMovies(
        @Query("apiKey") apiKey: String,
        @Query("source_ids") sourceIds: String = "203,57",
        @Query("types") types: String = "movie",
        @Query("region") region: String = "IN",
        @Query("limit") limit: Int = 20
    ): Single<TitleResponse>

    @GET("list-titles/")
    fun getTvShows(
        @Query("apiKey") apiKey: String,
        @Query("source_ids") sourceIds: String = "203,57",
        @Query("types") types: String = "tv_series",
        @Query("region") region: String = "IN",
        @Query("limit") limit: Int = 20
    ): Single<TitleResponse>

    @GET("title/{id}/details/")
    fun getTitleDetails(
        @Path("id") id: Int,
        @Query("apiKey") apiKey: String
    ): Single<TitleDetailsDto>
}

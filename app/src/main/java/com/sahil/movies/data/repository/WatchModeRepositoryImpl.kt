package com.sahil.movies.data.repository

import com.sahil.movies.BuildConfig

import com.sahil.movies.data.api.WatchModeApi
import com.sahil.movies.data.dto.TitleDetailsDto
import com.sahil.movies.data.dto.TitleListDto
import com.sahil.movies.data.dto.toDomain
import com.sahil.movies.domain.model.Title
import com.sahil.movies.domain.model.TitleDetails
import com.sahil.movies.domain.repo.WatchModeRepo
import io.reactivex.rxjava3.core.Single

class WatchModeRepositoryImpl(
    private val api: WatchModeApi
) : WatchModeRepo {


   // private val API_KEY = BuildConfig.WATCH_MODE_API
   private val API_KEY = "x6PuOZae83ANu645I3ViFaqbLgOIOcefph5Gisv4"

    override fun fetchMoviesAndShows(): Single<Pair<List<Title>, List<Title>>> {
        return Single.zip(
            api.getMovies(API_KEY),
            api.getTvShows(API_KEY)
        ) { movieRes, showRes ->
            Pair(
                movieRes.titles.map { it.toDomain() },
                showRes.titles.map { it.toDomain() }
            )
        }
    }

    override fun getDetails(id: Int): Single<TitleDetails> {
        return api.getTitleDetails(id, API_KEY)
            .map { it.toDomain() }
    }
}
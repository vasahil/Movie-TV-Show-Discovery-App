package com.sahil.movies.domain.repo


import com.sahil.movies.data.dto.TitleDetailsDto
import com.sahil.movies.data.dto.TitleListDto
import com.sahil.movies.domain.model.Title
import com.sahil.movies.domain.model.TitleDetails
import io.reactivex.rxjava3.core.Single

interface WatchModeRepo {

    fun fetchMoviesAndShows(): Single<Pair<List<Title>, List<Title>>>

    fun getDetails(id: Int) : Single<TitleDetails>
}
package com.sahil.movies.presentation.home

import android.util.Log
import androidx.lifecycle.ViewModel
import com.sahil.movies.BuildConfig
import com.sahil.movies.common.ResultState
import com.sahil.movies.data.dto.TitleListDto
import com.sahil.movies.domain.model.Title

import com.sahil.movies.domain.repo.WatchModeRepo
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel(
    private val repository: WatchModeRepo
) : ViewModel() {

    private val _state = MutableStateFlow<ResultState<Pair<List<Title>, List<Title>>>>(ResultState.Loading)
    val state = _state.asStateFlow()

    private val disposables = CompositeDisposable()


    private var lastFetchTime = 0L
    private val CACHE_DURATION = 5 * 60 * 1000L

    fun loadData(forceRefresh: Boolean = false) {
        val now = System.currentTimeMillis()


        if (!forceRefresh &&
            _state.value is ResultState.Success &&
            now - lastFetchTime < CACHE_DURATION) {
            Log.d("HomeViewModel", "Using cached data")
            return
        }

        _state.value = ResultState.Loading
        lastFetchTime = now

        disposables.add(
            repository.fetchMoviesAndShows()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe {
                    Log.d("HomeViewModel", "Starting to fetch movies and shows")
                }
                .subscribe(
                    { result ->

                        _state.value = ResultState.Success(result)
                    },
                    { error ->

                        val errorMessage = when {
                            error.message?.contains("Unable to resolve host") == true ->
                                "No internet connection. Please check your network."
                            error.message?.contains("timeout") == true ->
                                "Request timed out. Please try again."
                            error.message?.contains("401") == true ->
                                "Authentication failed. Please check API key."
                            else -> error.message ?: "An unexpected error occurred"
                        }
                        _state.value = ResultState.Error(errorMessage)
                    }
                )
        )
    }


    fun refresh() {
        loadData(forceRefresh = true)
    }

    override fun onCleared() {
        super.onCleared()
        disposables.clear()
        Log.d("HomeViewModel", "ViewModel cleared, disposables disposed")
    }
}

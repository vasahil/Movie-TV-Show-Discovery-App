package com.sahil.movies.presentation.details

import android.util.Log
import androidx.lifecycle.ViewModel
import com.sahil.movies.common.ResultState
import com.sahil.movies.domain.model.TitleDetails
import com.sahil.movies.domain.repo.WatchModeRepo
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class DetailsViewModel(
    private val repository: WatchModeRepo
) : ViewModel() {

    private val _state = MutableStateFlow<ResultState<TitleDetails>>(ResultState.Loading)
    val state = _state.asStateFlow()

    private val disposables = CompositeDisposable()

    fun loadDetails(id: Int) {
        _state.value = ResultState.Loading

        disposables.add(
            repository.getDetails(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe {
                    Log.d("DetailsViewModel", "Loading details for ID: $id")
                }
                .subscribe(
                    { title ->
                        _state.value = ResultState.Success(title)
                    },
                    { error ->

                        val errorMessage = when {
                            error.message?.contains("Unable to resolve host") == true ->
                                "No internet connection"
                            error.message?.contains("404") == true ->
                                "Content not found"
                            else -> error.message ?: "Failed to load details"
                        }
                        _state.value = ResultState.Error(errorMessage)
                    }
                )
        )
    }

    override fun onCleared() {
        super.onCleared()
        disposables.clear()

    }
}
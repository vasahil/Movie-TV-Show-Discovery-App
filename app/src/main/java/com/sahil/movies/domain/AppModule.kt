package com.sahil.movies.domain

import com.sahil.movies.data.api.RetrofitClient
import com.sahil.movies.data.repository.WatchModeRepositoryImpl

import com.sahil.movies.domain.repo.WatchModeRepo
import com.sahil.movies.presentation.details.DetailsViewModel
import com.sahil.movies.presentation.home.HomeViewModel
import io.reactivex.rxjava3.schedulers.Schedulers.single
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { RetrofitClient.createApi() }
    single< WatchModeRepo> { WatchModeRepositoryImpl(get()) }

    viewModel { HomeViewModel(get()) }
    viewModel { DetailsViewModel(get()) }
}
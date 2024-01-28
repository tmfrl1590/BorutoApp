package com.json.borutoapp.presentation.screens.home

import androidx.lifecycle.ViewModel
import com.json.borutoapp.domain.use_case.UseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
    useCases: UseCases
): ViewModel() {

    val getAllHeroes = useCases.getAllHeroesUseCase()
}
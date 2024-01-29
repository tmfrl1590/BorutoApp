package com.json.borutoapp.presentation.screens.search

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import com.json.borutoapp.domain.model.Hero
import com.json.borutoapp.domain.use_case.UseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val useCases: UseCases
) : ViewModel(){

    private val _searchQuery = mutableStateOf("")
    val searchQuery = _searchQuery

    private val _searchedHeroes = MutableStateFlow<PagingData<Hero>>(PagingData.empty())
    val searchedHeroes = _searchedHeroes


}
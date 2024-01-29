package com.json.borutoapp.presentation.screens.search

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.paging.compose.collectAsLazyPagingItems

@Composable
fun SearchScreen(
    navController: NavController,
    searchViewModel: SearchViewModel = hiltViewModel()
) {

    val searchQuery by searchViewModel.searchQuery
    val heroes = searchViewModel.searchedHeroes.collectAsLazyPagingItems()

    Scaffold(
        topBar = {
            SearchTopBar(
                text = searchQuery,
                onTextChange = {
                    //searchViewModel.updateSearchQuery(query = it)
                },
                onSearchClicked = {
                    //searchViewModel.searchHeroes(query = it)
                },
                onCloseClicked = {
                    navController.popBackStack()
                }
            )
        }
    ) {
        it
    }

}
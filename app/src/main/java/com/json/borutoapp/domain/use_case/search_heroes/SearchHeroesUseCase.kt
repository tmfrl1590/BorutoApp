package com.json.borutoapp.domain.use_case.search_heroes

import androidx.paging.PagingData
import com.json.borutoapp.data.repository.Repository
import com.json.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class SearchHeroesUseCase(
    private val repository: Repository,
) {
    operator fun invoke(query: String) : Flow<PagingData<Hero>>{
        return repository.searchHeroes(query = query)
    }
}
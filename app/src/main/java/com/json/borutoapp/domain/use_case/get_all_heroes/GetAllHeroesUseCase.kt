package com.json.borutoapp.domain.use_case.get_all_heroes

import androidx.paging.PagingData
import com.json.borutoapp.data.repository.Repository
import com.json.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class GetAllHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<PagingData<Hero>>{
        return repository.getAllHeroes()
    }
}
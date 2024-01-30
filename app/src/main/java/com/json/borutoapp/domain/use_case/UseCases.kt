package com.json.borutoapp.domain.use_case

import com.json.borutoapp.domain.use_case.get_all_heroes.GetAllHeroesUseCase
import com.json.borutoapp.domain.use_case.read_onboarding.ReadOnBoardingUseCase
import com.json.borutoapp.domain.use_case.save_onboarding.SaveOnBoardingUseCase
import com.json.borutoapp.domain.use_case.search_heroes.SearchHeroesUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getAllHeroesUseCase: GetAllHeroesUseCase,
    val searchHeroesUseCase: SearchHeroesUseCase,
)

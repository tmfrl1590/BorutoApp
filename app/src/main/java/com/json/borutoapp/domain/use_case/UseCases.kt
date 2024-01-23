package com.json.borutoapp.domain.use_case

import com.json.borutoapp.domain.use_case.read_onboarding.ReadOnBoardingUseCase
import com.json.borutoapp.domain.use_case.save_onboarding.SaveOnBoardingUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
)

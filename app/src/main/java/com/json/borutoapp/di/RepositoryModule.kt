package com.json.borutoapp.di

import android.content.Context
import com.json.borutoapp.data.repository.DataStoreOperationsImpl
import com.json.borutoapp.data.repository.Repository
import com.json.borutoapp.domain.repository.DataStoreOperations
import com.json.borutoapp.domain.use_case.UseCases
import com.json.borutoapp.domain.use_case.read_onboarding.ReadOnBoardingUseCase
import com.json.borutoapp.domain.use_case.save_onboarding.SaveOnBoardingUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperations(@ApplicationContext context: Context): DataStoreOperations {
        return DataStoreOperationsImpl(context = context)
    }

    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository = repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository = repository)
        )
    }
}
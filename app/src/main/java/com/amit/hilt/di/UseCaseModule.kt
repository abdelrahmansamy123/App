package com.amit.hilt.di

import com.amit.domain.repo.MainScreenRepo
import com.amit.domain.usecase.GetPosts
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    //Main
    @Provides
    fun provideGetPostUseCase(mainRepo: MainScreenRepo): GetPosts {
        return GetPosts(mainRepo)
    }
}
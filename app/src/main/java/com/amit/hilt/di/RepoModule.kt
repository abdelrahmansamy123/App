package com.amit.hilt.di

import com.amit.data.network.JsonPlaceHolderApi
import com.amit.data.repo.MainScreenRepoImp
import com.amit.domain.repo.MainScreenRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {


    @Provides
    fun provideMainScreenRepo(
        api: JsonPlaceHolderApi
    ): MainScreenRepo {
        return MainScreenRepoImp(api)
    }
}
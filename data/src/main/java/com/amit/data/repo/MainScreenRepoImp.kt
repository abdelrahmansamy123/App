package com.amit.data.repo

import com.amit.data.network.JsonPlaceHolderApi
import com.amit.domain.entity.PostModelResponseItem
import com.amit.domain.repo.MainScreenRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MainScreenRepoImp constructor(private val api: JsonPlaceHolderApi) : MainScreenRepo {
    override suspend fun getPosts(): List<PostModelResponseItem> = withContext(Dispatchers.IO) {
        return@withContext api.getPosts()
    }
}
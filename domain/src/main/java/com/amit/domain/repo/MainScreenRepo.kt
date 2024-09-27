package com.amit.domain.repo

import com.amit.domain.entity.PostModelResponseItem

interface MainScreenRepo {
    suspend fun getPosts(): List<PostModelResponseItem>
}
package com.amit.domain.usecase

import com.amit.domain.repo.MainScreenRepo

class GetPosts(private val mainScreenRepo: MainScreenRepo) {
    operator suspend fun invoke() = mainScreenRepo.getPosts()
}
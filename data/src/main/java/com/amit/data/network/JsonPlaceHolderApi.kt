package com.amit.data.network

import com.amit.domain.entity.PostModelResponseItem
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface JsonPlaceHolderApi {
    @GET("posts")
    suspend fun getPosts(): List<PostModelResponseItem>

    @GET("posts/{id}")
    suspend fun getPostsById(@Path("id") id: Int): PostModelResponseItem

    @GET("comments")
    suspend fun getPostsByUserId(@Query("postId") postId: Int): List<PostModelResponseItem>
}
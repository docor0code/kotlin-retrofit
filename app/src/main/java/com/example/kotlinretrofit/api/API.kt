package com.example.kotlinretrofit.api

import com.example.kotlinretrofit.model.Posts
import retrofit2.http.GET

interface API {

    // get posts api interface
    @GET("posts/1")
    suspend fun getPosts(): Posts
}
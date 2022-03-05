package com.example.kotlinretrofit.repository

import com.example.kotlinretrofit.api.RetrofitInstance
import com.example.kotlinretrofit.model.Posts

class Repository {

    // Repository Class
    suspend fun getPosts(): Posts {
        return RetrofitInstance.api.getPosts()
    }
}
package com.example.kotlinretrofit.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinretrofit.model.Posts
import com.example.kotlinretrofit.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository) : ViewModel() {

    val myResponse: MutableLiveData<Posts> = MutableLiveData()

    fun getPosts() {
        viewModelScope.launch {
            val response = repository.getPosts()
            myResponse.value = response
        }
    }
}
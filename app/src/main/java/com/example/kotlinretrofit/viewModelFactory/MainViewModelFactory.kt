package com.example.kotlinretrofit.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinretrofit.repository.Repository
import com.example.kotlinretrofit.viewModel.MainViewModel

class MainViewModelFactory(private val repository: Repository): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}
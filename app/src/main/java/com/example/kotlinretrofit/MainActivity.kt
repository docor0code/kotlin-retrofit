package com.example.kotlinretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinretrofit.repository.Repository
import com.example.kotlinretrofit.viewModel.MainViewModel
import com.example.kotlinretrofit.viewModelFactory.MainViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        viewModel.getPosts()

        viewModel.myResponse.observe(this, Observer {

            response ->

            result.text = response.toString()

        })

        // so, thanks for watching
        // dont forget like or dislike for this video and rating & share your comments
        // thanks for your subscribe
        // see you later
        // GodBye
    }
}
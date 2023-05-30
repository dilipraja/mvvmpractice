package com.example.dilippractice

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dilippractice.repo.MovieRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val repo: MovieRepo) : ViewModel() {
    val data get() = repo.data

    //View requested data
    //asking repo
    fun getMovies() {
        viewModelScope.launch {
            repo.getMovies()
        }

    }

}
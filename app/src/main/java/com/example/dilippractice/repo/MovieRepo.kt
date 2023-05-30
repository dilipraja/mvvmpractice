package com.example.dilippractice.repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.dilippractice.Api
import com.example.dilippractice.Constants
import com.example.dilippractice.model.Movies
import javax.inject.Inject

class MovieRepo @Inject constructor(val api: Api){
     private val _movies = MutableLiveData<Movies>()
     val data get() = _movies

    // ViewModel requested data
    // Getting form server
    suspend fun getMovies(){
       Log.i("","getMovies")
       val response = api.getPopularMovies(Constants.API_KEY)
       if(response.isSuccessful){
          data.postValue(response.body())
       }
    }

}
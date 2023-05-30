package com.example.dilippractice

import com.example.dilippractice.model.Movies
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("popular?")
    suspend fun getPopularMovies(@Query("api_key") api_key : String) : Response<Movies>
}
package com.example.dilippractice.model

import com.google.gson.annotations.SerializedName

class Movies(

    @SerializedName("page") val page: Int?,
    @SerializedName("total_pages") val total_pages: Int?,
    @SerializedName("total_results") val total_results: Int?,
    @SerializedName("movieResults") val movieResults:  List<MovieResult>?

)

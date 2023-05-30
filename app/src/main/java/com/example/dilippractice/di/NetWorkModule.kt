package com.example.dilippractice.di

import com.example.dilippractice.Api
import com.example.dilippractice.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetWorkModule {
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit.Builder{
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }

    @Singleton
    @Provides
    fun providesMovieApi(retrofitBuilder: Retrofit.Builder): Api {
        return retrofitBuilder.build().create(Api::class.java)
    }
}
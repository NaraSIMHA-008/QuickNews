package com.example.newsapp.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiProvider {
    //    fun provideApi(){
//        Retrofit.Builder().baseUrl(BASE_URL)
//    }
    fun provideApi() =
        Retrofit.Builder().baseUrl(BASE_URL)
            .client(OkHttpClient.Builder().build())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiService::class.java)

}
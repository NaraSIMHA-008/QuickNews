package com.example.newsapp.Screen

import com.example.newsapp.network.NewsModel

sealed class Result<T>(val data: NewsModel? = null, val message:String? = null){

    class Success<T>(data: NewsModel?):Result<T>(data = data)
    class Loading<T>(message: String? = null):Result<T>()
    class Error<T>(message: String?):Result<T>(message = message)

}
package com.example.getappretrofit

import com.example.getappretrofit.api.SimpleApi
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.jackson.JacksonConverterFactory

    object RetrofitInstance {

        private val retrofit by lazy {
            Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/posts/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        val api: SimpleApi by lazy {
            retrofit.create(SimpleApi::class.java)
        }

    }


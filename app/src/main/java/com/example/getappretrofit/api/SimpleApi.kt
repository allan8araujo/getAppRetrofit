package com.example.getappretrofit.api

import com.example.getappretrofit.model.Post
import retrofit2.http.GET

interface SimpleApi {
    @GET("/posts/1")
    suspend fun getPost():Post

}
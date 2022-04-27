package com.example.getappretrofit.repository

import com.example.getappretrofit.RetrofitInstance
import com.example.getappretrofit.model.Post

class Repository {
    suspend fun getPost():Post{
        return RetrofitInstance.api.getPost()
    }
}
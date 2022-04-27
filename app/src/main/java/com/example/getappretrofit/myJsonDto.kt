package com.example.getappretrofit

import com.fasterxml.jackson.annotation.JsonProperty
import com.google.gson.JsonArray

data class myJSON (
    @JsonProperty("code") val code:Long,
    @JsonProperty("empresa") val empresa:String,
    @JsonProperty("item") var item:JsonArray
)

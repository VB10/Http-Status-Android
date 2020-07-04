package com.hwa.restonplaceholder.service

import com.hwa.restonplaceholder.data.HttpCatModel
import kotlinx.coroutines.Deferred
import retrofit2.Call
import retrofit2.http.GET

interface IApiHttpCat {

    @GET("/http.json")
    fun getHttpCatList(): Call<List<HttpCatModel>>
}
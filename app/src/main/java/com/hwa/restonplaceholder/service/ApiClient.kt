package com.hwa.restonplaceholder.service

import com.google.gson.GsonBuilder
import com.hwa.restonplaceholder.data.HttpCatModel
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private const val BASE_URL: String = "https://hwasampleapi.firebaseio.com"

    val getClient: IApiHttpCat
        get() {

            val gson = GsonBuilder()
                .setLenient().create()
            val client = OkHttpClient.Builder().build()
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()


            return retrofit.create(IApiHttpCat::class.java)
        }
}
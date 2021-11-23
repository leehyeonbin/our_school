package com.example.ourschool.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuild {
    lateinit var api: API

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://open.neis.go.kr/hub/mealServiceDietInfo?")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(API::class.java)
    }
}
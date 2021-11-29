package com.example.ourschool.model

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface API {
    // mealServiceDietInfo?ATPT_OFCDC_SC_CODE=F10&SD_SCHUL_CODE=7380292&MLSV_YMD={date}
    @GET("mealServiceDietInfo")
    fun getMealsInfo(@QueryMap query: Map<String, String>):retrofit2.Call<ResponseMealsInfo>
    // BASEURL/post/
}
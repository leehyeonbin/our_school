package com.example.ourschool.model

import retrofit2.http.GET
import retrofit2.http.Path
import java.util.*

interface API {
    @GET("KEY=649ade0fb13b46f0a76611150b7fe46d&Type=json&pIndex=1&pSize=100&ATPT_OFCDC_SC_CODE=F10&SD_SCHUL_CODE=7380292&MLSV_YMD={date}")

    fun getMealsInfo(@Path("date")date: Date):retrofit2.Call<ResponseMealsInfo>
}
package com.example.ourschool.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.ourschool.model.ResponseMealsInfo
import com.example.ourschool.model.RetrofitBuild
import retrofit2.Call
import retrofit2.Response
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


class MainViewModel : ViewModel() {
    fun getMeals() {
        val date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"))
        Log.d("TAG", date)
        RetrofitBuild.api.getMealsInfo(date = date).enqueue(object : retrofit2.Callback<ResponseMealsInfo>{
            override fun onResponse(
                call: Call<ResponseMealsInfo>,
                response: Response<ResponseMealsInfo>
            ) {
                val mealinfo = response.body()
                Log.d("TAG",mealinfo.toString())
            }

            override fun onFailure(call: Call<ResponseMealsInfo>, t: Throwable) {

            }
        })
    }
}
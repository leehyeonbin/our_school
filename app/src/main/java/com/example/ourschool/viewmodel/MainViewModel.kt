package com.example.ourschool.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.ourschool.model.ResponseMealsInfo
import com.example.ourschool.model.RetrofitBuild
import retrofit2.Call
import retrofit2.Response


class MainViewModel : ViewModel() {
    fun getMeals(date : String) {
        Log.d("TAG", date)

        val queries: HashMap<String, String> = HashMap()

        queries["KEY"] = "649ade0fb13b46f0a76611150b7fe46d"
        queries["Type"] = "json"
        queries["pIndex"] = "1"
        queries["pSize"] = "100"
        queries["ATPT_PFCDC_SC_CODE"] = "F10"
        queries["SD_SCHUL_CODE"] = "7380292"
        queries["MLSV_YMD"] = date

        RetrofitBuild.api.getMealsInfo(queries).enqueue(object : retrofit2.Callback<ResponseMealsInfo> {
                override fun onResponse(
                    call: Call<ResponseMealsInfo>,
                    response: Response<ResponseMealsInfo>
                ) {
                    val mealinfo = response.body()
                    Log.d("TAG", mealinfo.toString())
                }

                override fun onFailure(call: Call<ResponseMealsInfo>, t: Throwable) {
                    Log.e("error", t.message.toString())
                }
            })
    }
}
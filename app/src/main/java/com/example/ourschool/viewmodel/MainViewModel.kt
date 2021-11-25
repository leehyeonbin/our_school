package com.example.ourschool.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.ourschool.model.RetrofitBuild
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


class MainViewModel : ViewModel() {
    fun getMeals() {
        val date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
        Log.d("TAG", date)
    }
}
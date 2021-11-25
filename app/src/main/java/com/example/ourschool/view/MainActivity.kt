package com.example.ourschool.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.ourschool.R
import com.example.ourschool.databinding.ActivityMainBinding
import com.example.ourschool.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        viewModel.getMeals()

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_view) as NavHostFragment
        val navController = navHostFragment.navController

        NavigationUI.setupWithNavController(mBinding.bottomNavView, navController)


    }


}
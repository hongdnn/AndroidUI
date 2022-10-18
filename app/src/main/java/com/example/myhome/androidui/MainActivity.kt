package com.example.myhome.androidui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.myhome.androidui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        initView()
    }

    private fun initView() {
        with(mBinding) {
            (supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment).navController.let {
                bottomNavigation.setupWithNavController(it)
            }
        }
    }
}
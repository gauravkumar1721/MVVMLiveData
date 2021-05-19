package com.example.mvvmlogin.Views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmlogin.R

public class LoginDataBindingActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm_basic_login_layout)
        supportFragmentManager.beginTransaction().replace(R.id.container_basic_login, LoginDatabindingFragment()).commit()

    }
}
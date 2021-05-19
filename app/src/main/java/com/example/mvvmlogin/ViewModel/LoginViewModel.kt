package com.mvvm.kot.Kotlin_login_dataBinding.ViewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.mvvmlogin.Repo.ValidationRepository

class LoginViewModel: AndroidViewModel {
    private var validationRepository: ValidationRepository

    constructor(application: Application) : super(application){
        validationRepository = ValidationRepository(application)
    }

    fun validateCredentials(email:String,passWord:String): LiveData<String> {
        return validationRepository.validateCredentials(email,passWord)
    }
}
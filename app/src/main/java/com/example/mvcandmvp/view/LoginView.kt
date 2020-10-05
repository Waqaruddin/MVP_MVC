package com.example.mvcandmvp.view

interface LoginView {

    fun setEmailError()
    fun setPasswordError()
    fun redirect()
    fun showMessage(message:String)
}
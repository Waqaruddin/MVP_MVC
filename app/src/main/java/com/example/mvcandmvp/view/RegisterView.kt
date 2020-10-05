package com.example.mvcandmvp.view

interface RegisterView {

    fun setEmailErro()
    fun setPasswordError()
    fun setNameerror()
    fun redirect()
    fun showMessage(message:String)
}
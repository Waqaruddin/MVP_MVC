package com.example.mvcandmvp.models

import com.example.mvcandmvp.presenter.LoginPresenter
import com.example.mvcandmvp.view.LoginView

class LoginPresenterImp(var loginView:LoginView): LoginPresenter {

    override fun login(email: String, password: String) {
        if(email.equals("admin") && password.equals("123")){
            //Login success
            loginView.showMessage("Login Success")
        }else{
            //Login fail
            loginView.showMessage("Login Fail")
        }
    }
}
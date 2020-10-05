package com.example.mvcandmvp.models

import com.example.mvcandmvp.presenter.RegisterPresenter
import com.example.mvcandmvp.view.RegisterView

class RegisterPresenterImp(var registerView: RegisterView):RegisterPresenter{
    override fun register(name: String, email: String, password: String) {
        if(name != "" && email != "" && password != ""){
            registerView.showMessage("Register Success")
        }else{
            registerView.showMessage("Register failed")
        }

    }

}
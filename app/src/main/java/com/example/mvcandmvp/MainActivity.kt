package com.example.mvcandmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mvcandmvp.models.LoginPresenterImp
import com.example.mvcandmvp.presenter.LoginPresenter
import com.example.mvcandmvp.view.LoginView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), LoginView {

    lateinit var loginPresenter:LoginPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginPresenter = LoginPresenterImp(this)

        init()
    }

    private fun init() {
        button_login.setOnClickListener {
            var email = edit_text_email.text.toString()
            var password = edit_text_password.text.toString()

            loginPresenter.login(email, password)
        }
    }

    override fun setEmailError() {

    }

    override fun setPasswordError() {

    }

    override fun redirect() {

    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message , Toast.LENGTH_SHORT).show()

    }
}
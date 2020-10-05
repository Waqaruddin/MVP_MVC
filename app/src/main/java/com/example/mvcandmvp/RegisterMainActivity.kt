package com.example.mvcandmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mvcandmvp.models.RegisterPresenterImp
import com.example.mvcandmvp.presenter.RegisterPresenter
import com.example.mvcandmvp.view.RegisterView
import kotlinx.android.synthetic.main.activity_register_main.*

class RegisterMainActivity : AppCompatActivity(), RegisterView {
    lateinit var registerPresenter: RegisterPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_main)
        registerPresenter = RegisterPresenterImp(this)

        init()
    }

    private fun init() {
        button_register.setOnClickListener {
            var name = edit_text_name.text.toString()
            var email = edit_text_email.text.toString()
            var password = edit_text_password.text.toString()

            registerPresenter.register(name, email, password)
        }
    }

    override fun setEmailErro() {
        TODO("Not yet implemented")
    }

    override fun setPasswordError() {
        TODO("Not yet implemented")
    }

    override fun setNameerror() {
        TODO("Not yet implemented")
    }

    override fun redirect() {
        TODO("Not yet implemented")
    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
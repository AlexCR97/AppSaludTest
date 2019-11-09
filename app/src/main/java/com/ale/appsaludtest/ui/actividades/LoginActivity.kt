package com.ale.appsaludtest.ui.actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ale.appsaludtest.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        bLogin.setOnClickListener {
            startActivity(Intent(this, InicioActivity::class.java))
            finish()
        }
    }
}
package com.xsas.appsaludtest.ui.actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.dominio.validadores.ValidadorUsuario
import com.xsas.appsaludtest.datos.entidades.Usuario
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

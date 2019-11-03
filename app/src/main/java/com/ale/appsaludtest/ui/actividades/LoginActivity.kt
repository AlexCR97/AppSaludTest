package com.ale.appsaludtest.ui.actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ale.appsaludtest.R
import com.ale.appsaludtest.dominio.validadores.ValidadorUsuario
import com.ale.appsaludtest.datos.entidades.Usuario
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        bLogin.setOnClickListener {
            val userName: String = etUserName.text.toString()
            val email: String = etEmail.text.toString()
            val password: String = etPassword.text.toString()

            val user = Usuario(userName, email, password)
            val validador = ValidadorUsuario(user)

            if (!validador.validar()) {
                //Toast.makeText(this, validator.lastError()?.errorMessage(), Toast.LENGTH_LONG).show()
                //return@setOnClickListener
            }

            //startActivity(Intent(this, SeccionEncuestaActivity::class.java))
            //startActivity(Intent(this, SeccionGeoreferenciacionActivity::class.java))
            //startActivity(Intent(this, SeccionDatosGeneralesActivity::class.java))
            startActivity(Intent(this, SeccionOtrosActivity::class.java))
        }
    }
}

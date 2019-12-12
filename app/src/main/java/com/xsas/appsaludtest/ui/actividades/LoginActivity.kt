package com.xsas.appsaludtest.ui.actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.dominio.validadores.ValidadorPool
import com.xsas.appsaludtest.dominio.validadores.propiedades.ValidadorContrasena
import com.xsas.appsaludtest.dominio.validadores.propiedades.ValidadorCorreoElectronico
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        bLogin.setOnClickListener {
            /*if (!validarCredenciales())
                return@setOnClickListener

            if (obtenerUsuario() == null)
                return@setOnClickListener*/

            iniciarSesion()
        }
    }

    private fun iniciarSesion() {
        startActivity(Intent(this, InicioActivity::class.java))
        finish()
    }

    private fun obtenerUsuario(): Any? {
        return Any()
    }

    private fun validarCredenciales(): Boolean {
        val correo: String = etUserName.text.toString()
        val contrasena: String = etPassword.text.toString()

        val validadorPool = ValidadorPool.Builder()
            .agregarValidador(ValidadorCorreoElectronico(correo))
            .agregarValidador(ValidadorContrasena(contrasena))
            .build()

        if (!validadorPool.validarTodo()) {
            Toast.makeText(this, validadorPool.ultimoError()?.mensajeError(), Toast.LENGTH_SHORT).show()
            return false
        }

        return true
    }
}

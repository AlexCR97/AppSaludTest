package com.xsas.appsaludtest.ui.actividades

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xsas.appsaludtest.R
import kotlinx.android.synthetic.main.activity_encuesta_terminada.*

class EncuestaTerminadaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_encuesta_terminada)

        bNuevaEncuesta.setOnClickListener {

        }

        bRegresarAlInicio.setOnClickListener {
            val intent = Intent(this, InicioActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

        val dialogo = ProgressDialog(this)
        dialogo.setMessage("Guardando encuesta...")
        dialogo.show()
    }
}

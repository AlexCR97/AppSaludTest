package com.xsas.appsaludtest.ui.actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xsas.appsaludtest.R
import kotlinx.android.synthetic.main.activity_inicio.*

class InicioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
        cvNueva.setOnClickListener{
            startActivity(Intent(this,AntescedentesPersonalesActivity::class.java))
            finish()
        }
        cvReanudar.setOnClickListener{
            startActivity(Intent(this,CaracteristicasViviendaActivity::class.java))
            finish()
        }
        cvActualizar.setOnClickListener{
            startActivity(Intent(this,EnfermedadesActivity::class.java))
            finish()
        }
    }
}
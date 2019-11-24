package com.xsas.appsaludtest.ui.actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xsas.appsaludtest.R
import kotlinx.android.synthetic.main.activity_cantidad_integrantes.*

class CantidadIntegrantesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cantidad_integrantes)

        var i = 1

        bSumar.setOnClickListener{
            i++
            tvNumero.text = i.toString()
        }

        bRestar.setOnClickListener{
            if (i == 1) {

            } else {
                i--
                tvNumero.text = i.toString()
            }
        }

        bEmpezar.setOnClickListener{
            val intent = Intent(this, SeccionGeoreferenciacionActivity::class.java)
            startActivity(intent)
        }
    }
}
package com.ale.appsaludtest.ui.actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ale.appsaludtest.R
import kotlinx.android.synthetic.main.activity_cantidad_integrantes.*

class CantidadIntegrantesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cantidad_integrantes)
        var i = 0;
        bSumar.setOnClickListener{
            i++
            tvNumero.text = i.toString()
        }
        bRestar.setOnClickListener{
            if (i == 0){

            }else{
                i--
                tvNumero.text = i.toString()
            }
        }
        bEmpezar.setOnClickListener{
            startActivity(Intent(this, AntescedentesPersonalesActivity::class.java))
        }
    }
}

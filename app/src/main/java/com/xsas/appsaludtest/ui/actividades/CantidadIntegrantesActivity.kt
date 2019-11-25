package com.xsas.appsaludtest.ui.actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.ui.EncuestaSingleton
import com.xsas.appsaludtest.ui.modelos.CantidadIntegrantesViewModel
import kotlinx.android.synthetic.main.activity_cantidad_integrantes.*

class CantidadIntegrantesActivity : AppCompatActivity() {

    private lateinit var viewModel: CantidadIntegrantesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cantidad_integrantes)

        viewModel = ViewModelProviders.of(this)[CantidadIntegrantesViewModel::class.java]

        viewModel.getCantidadIntegrantes().observe(this, Observer {
            tvNumero.text = it.toString()
        })

        bSumar.setOnClickListener{
            viewModel.agregarIntegrante()
        }

        bRestar.setOnClickListener{
            viewModel.quitarIntegrante()
        }

        bEmpezar.setOnClickListener{
            EncuestaSingleton.cantidadIntegrantes = viewModel.getCantidadIntegrantes().value!!

            val intent = Intent(this, SeccionGeoreferenciacionActivity::class.java)
            startActivity(intent)
        }

        viewModel.agregarIntegrante()
        viewModel.quitarIntegrante()
    }
}

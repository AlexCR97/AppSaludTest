package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager

import com.ale.appsaludtest.R
import com.ale.appsaludtest.entidades.DatosPersonales
import com.ale.appsaludtest.ui.adaptadores.DatosPersonalesAdapter
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    private lateinit var nav: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)

        etCantidadIntegrantes.addTextChangedListener {
            val text: String = etCantidadIntegrantes.text.toString()
            val cantidad: Int = if (text.isNotBlank()) text.toInt() else 1

            establecerListas(cantidad)
        }

        establecerListas(1)
    }

    private fun establecerListas(cantidad: Int) {
        val datosPersonales = ArrayList<DatosPersonales>()

        for (i in 1 until cantidad + 1)
            datosPersonales.add(DatosPersonales(
                "Nombre $i",
                "Apellido Paterno $i",
                "Apellido Materno $i",
                "Sexo $i",
                "Fecha Nacimiento $i"
            ))

        rvDatosPersonales.adapter = context?.let { DatosPersonalesAdapter(datosPersonales, it) }
        rvDatosPersonales.layoutManager = LinearLayoutManager(context)
    }
}

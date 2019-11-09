package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.ale.appsaludtest.R
import com.ale.appsaludtest.datos.vistas.EsquemaVacunacionAdultoHombre2
import com.ale.appsaludtest.ui.adaptadores.EsquemaVacunacionAdultoHombre2Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_adulto_hombre2.*

class SeccionEsquemaVacunacionAdultoHombre2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_adulto_hombre2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionAdultoHombre2(),
            EsquemaVacunacionAdultoHombre2(),
            EsquemaVacunacionAdultoHombre2()
        )

        rvEsquemaVacunacionAdultoHombre2.adapter = context?.let { EsquemaVacunacionAdultoHombre2Adapter(vistas, it) }
        rvEsquemaVacunacionAdultoHombre2.layoutManager = LinearLayoutManager(context)
    }

}

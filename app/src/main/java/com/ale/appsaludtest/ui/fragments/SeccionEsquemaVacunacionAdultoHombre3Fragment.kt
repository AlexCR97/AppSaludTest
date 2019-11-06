package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.ale.appsaludtest.R
import com.ale.appsaludtest.datos.vistas.EsquemaVacunacionAdultoHombre3
import com.ale.appsaludtest.ui.adaptadores.EsquemaVacunacionAdultoHombre3Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_adulto_hombre3.*

class SeccionEsquemaVacunacionAdultoHombre3Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_adulto_hombre3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionAdultoHombre3(),
            EsquemaVacunacionAdultoHombre3(),
            EsquemaVacunacionAdultoHombre3()
        )

        rvEsquemaVacunacionAdultoHombre3.adapter = context?.let { EsquemaVacunacionAdultoHombre3Adapter(vistas, it) }
        rvEsquemaVacunacionAdultoHombre3.layoutManager = LinearLayoutManager(context)
    }
}

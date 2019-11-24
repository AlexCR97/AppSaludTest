package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoHombre1
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionAdultoHombre1Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_adulto_hombre1.*

class SeccionEsquemaVacunacionAdultoHombre1Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_adulto_hombre1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionAdultoHombre1(),
            EsquemaVacunacionAdultoHombre1(),
            EsquemaVacunacionAdultoHombre1()
        )

        rvEsquemaVacunacionAdultoHombre1.adapter = context?.let { EsquemaVacunacionAdultoHombre1Adapter(vistas, it) }
        rvEsquemaVacunacionAdultoHombre1.layoutManager = LinearLayoutManager(context)
    }

}

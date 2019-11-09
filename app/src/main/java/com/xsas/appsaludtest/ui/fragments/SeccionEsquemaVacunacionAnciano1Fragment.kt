package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAnciano1
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionAnciano1Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_anciano1.*

class SeccionEsquemaVacunacionAnciano1Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_anciano1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionAnciano1(),
            EsquemaVacunacionAnciano1(),
            EsquemaVacunacionAnciano1()
        )

        rvEsquemaVacunacionAnciano1.adapter = context?.let { EsquemaVacunacionAnciano1Adapter(vistas, it) }
        rvEsquemaVacunacionAnciano1.layoutManager = LinearLayoutManager(context)
    }

}

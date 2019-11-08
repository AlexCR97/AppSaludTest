package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAnciano2
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionAnciano2Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_anciano2.*

class SeccionEsquemaVacunacionAnciano2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_anciano2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionAnciano2(),
            EsquemaVacunacionAnciano2(),
            EsquemaVacunacionAnciano2()
        )

        rvEsquemaVacunacionAnciano2.adapter = context?.let { EsquemaVacunacionAnciano2Adapter(vistas, it) }
        rvEsquemaVacunacionAnciano2.layoutManager = LinearLayoutManager(context)
    }

}

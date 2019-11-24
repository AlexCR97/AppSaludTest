package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionNino2
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionNino2Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_nino2.*

class SeccionEsquemaVacunacionNino2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_nino2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionNino2(),
            EsquemaVacunacionNino2(),
            EsquemaVacunacionNino2()
        )

        rvEsquemaVacunacionNino2.adapter = context?.let { EsquemaVacunacionNino2Adapter(vistas, it) }
        rvEsquemaVacunacionNino2.layoutManager = LinearLayoutManager(context)
    }

}

package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionNino1
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionNino1Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_nino1.*

class SeccionEsquemaVacunacionNino1Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_nino1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionNino1(),
            EsquemaVacunacionNino1(),
            EsquemaVacunacionNino1()
        )

        rvEsquemaVacunacionNino1.adapter = context?.let { EsquemaVacunacionNino1Adapter(vistas, it) }
        rvEsquemaVacunacionNino1.layoutManager = LinearLayoutManager(context)
    }
}

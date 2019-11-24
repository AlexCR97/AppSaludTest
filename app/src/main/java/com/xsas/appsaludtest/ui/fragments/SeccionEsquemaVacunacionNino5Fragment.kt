package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionNino5
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionNino5Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_nino5.*

class SeccionEsquemaVacunacionNino5Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_nino5, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionNino5(),
            EsquemaVacunacionNino5(),
            EsquemaVacunacionNino5()
        )

        rvEsquemaVacunacionNino5.adapter = context?.let { EsquemaVacunacionNino5Adapter(vistas, it) }
        rvEsquemaVacunacionNino5.layoutManager = LinearLayoutManager(context)
    }

}

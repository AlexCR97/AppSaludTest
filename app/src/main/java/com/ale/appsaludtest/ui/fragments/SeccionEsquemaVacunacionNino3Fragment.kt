package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.ale.appsaludtest.R
import com.ale.appsaludtest.datos.vistas.EsquemaVacunacionNino3
import com.ale.appsaludtest.ui.adaptadores.EsquemaVacunacionNino3Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_nino3.*

class SeccionEsquemaVacunacionNino3Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_nino3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionNino3(),
            EsquemaVacunacionNino3(),
            EsquemaVacunacionNino3()
        )

        rvEsquemaVacunacionNino3.adapter = context?.let { EsquemaVacunacionNino3Adapter(vistas, it) }
        rvEsquemaVacunacionNino3.layoutManager = LinearLayoutManager(context)
    }
}

package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoMujer2
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionAdultoMujer2Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_adulto_mujer2.*

class SeccionEsquemaVacunacionAdultoMujer2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_adulto_mujer2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionAdultoMujer2(),
            EsquemaVacunacionAdultoMujer2(),
            EsquemaVacunacionAdultoMujer2()
        )

        rvEsquemaVacunacionAdultoMujer2.adapter = context?.let { EsquemaVacunacionAdultoMujer2Adapter(vistas, it) }
        rvEsquemaVacunacionAdultoMujer2.layoutManager = LinearLayoutManager(context)
    }
}

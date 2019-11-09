package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.ale.appsaludtest.R
import com.ale.appsaludtest.datos.vistas.EsquemaVacunacionAdultoMujer3
import com.ale.appsaludtest.ui.adaptadores.EsquemaVacunacionAdultoMujer3Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_adulto_mujer3.*

class SeccionEsquemaVacunacionAdultoMujer3Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_adulto_mujer3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionAdultoMujer3(),
            EsquemaVacunacionAdultoMujer3(),
            EsquemaVacunacionAdultoMujer3()
        )

        rvEsquemaVacunacionAdultoMujer3.adapter = context?.let { EsquemaVacunacionAdultoMujer3Adapter(vistas, it) }
        rvEsquemaVacunacionAdultoMujer3.layoutManager = LinearLayoutManager(context)
    }
}
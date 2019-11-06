package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.ale.appsaludtest.R
import com.ale.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente6
import com.ale.appsaludtest.ui.adaptadores.EsquemaVacunacionAdolescente6Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_adolescente6.*

class SeccionEsquemaVacunacionAdolescente6Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_adolescente6, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionAdolescente6(),
            EsquemaVacunacionAdolescente6(),
            EsquemaVacunacionAdolescente6()
        )

        rvEsquemaVacunacionAdolescente6.adapter = context?.let { EsquemaVacunacionAdolescente6Adapter(vistas, it) }
        rvEsquemaVacunacionAdolescente6.layoutManager = LinearLayoutManager(context)
    }
}

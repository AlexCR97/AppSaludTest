package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.ale.appsaludtest.R
import com.ale.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente5
import com.ale.appsaludtest.ui.adaptadores.EsquemaVacunacionAdolescente5Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_adolescente5.*

class SeccionEsquemaVacunacionAdolescente5Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_adolescente5, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionAdolescente5(),
            EsquemaVacunacionAdolescente5(),
            EsquemaVacunacionAdolescente5()
        )

        rvEsquemaVacunacionAdolescente5.adapter = context?.let { EsquemaVacunacionAdolescente5Adapter(vistas, it) }
        rvEsquemaVacunacionAdolescente5.layoutManager = LinearLayoutManager(context)
    }
}

package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.ale.appsaludtest.R
import com.ale.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente3
import com.ale.appsaludtest.ui.adaptadores.EsquemaVacunacionAdolescente3Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_adolescente3.*

class SeccionEsquemaVacunacionAdolescente3Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_adolescente3, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionAdolescente3(),
            EsquemaVacunacionAdolescente3(),
            EsquemaVacunacionAdolescente3()
        )

        rvEsquemaVacunacionAdolescente3.adapter = context?.let { EsquemaVacunacionAdolescente3Adapter(vistas, it) }
        rvEsquemaVacunacionAdolescente3.layoutManager = LinearLayoutManager(context)
    }
}

package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.ale.appsaludtest.R
import com.ale.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente1
import com.ale.appsaludtest.ui.adaptadores.EsquemaVacunacionAdolescente1Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_adolescente1.*

class SeccionEsquemaVacunacionAdolescente1Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_adolescente1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionAdolescente1(),
            EsquemaVacunacionAdolescente1(),
            EsquemaVacunacionAdolescente1(),
            EsquemaVacunacionAdolescente1()
        )

        rvEsquemaVacunacionAdolescente1.adapter = context?.let { EsquemaVacunacionAdolescente1Adapter(vistas, it) }
        rvEsquemaVacunacionAdolescente1.layoutManager = LinearLayoutManager(context)
    }
}

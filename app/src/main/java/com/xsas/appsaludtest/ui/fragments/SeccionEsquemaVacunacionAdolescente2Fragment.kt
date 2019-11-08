package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente2
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionAdolescente2Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_adolescente2.*

class SeccionEsquemaVacunacionAdolescente2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_adolescente2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionAdolescente2(),
            EsquemaVacunacionAdolescente2(),
            EsquemaVacunacionAdolescente2()
        )

        rvEsquemaVacunacionAdolescente2.adapter = context?.let { EsquemaVacunacionAdolescente2Adapter(vistas, it) }
        rvEsquemaVacunacionAdolescente2.layoutManager = LinearLayoutManager(context)
    }

}

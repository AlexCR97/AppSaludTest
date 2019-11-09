package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.ale.appsaludtest.R
import com.ale.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente4
import com.ale.appsaludtest.ui.adaptadores.EsquemaVacunacionAdolescente4Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_adolescente4.*

class SeccionEsquemaVacunacionAdolescente4Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_adolescente4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionAdolescente4(),
            EsquemaVacunacionAdolescente4(),
            EsquemaVacunacionAdolescente4()
        )

        rvEsquemaVacunacionAdolescente4.adapter = context?.let { EsquemaVacunacionAdolescente4Adapter(vistas, it) }
        rvEsquemaVacunacionAdolescente4.layoutManager = LinearLayoutManager(context)
    }
}

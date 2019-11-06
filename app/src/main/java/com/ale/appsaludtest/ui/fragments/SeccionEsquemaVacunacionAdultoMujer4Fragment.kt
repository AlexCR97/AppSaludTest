package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.ale.appsaludtest.R
import com.ale.appsaludtest.datos.vistas.EsquemaVacunacionAdultoMujer4
import com.ale.appsaludtest.ui.adaptadores.EsquemaVacunacionAdultoMujer4Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_adulto_mujer4.*

class SeccionEsquemaVacunacionAdultoMujer4Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_adulto_mujer4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionAdultoMujer4(),
            EsquemaVacunacionAdultoMujer4(),
            EsquemaVacunacionAdultoMujer4()
        )

        rvEsquemaVacunacionAdultoMujer4.adapter = context?.let { EsquemaVacunacionAdultoMujer4Adapter(vistas, it) }
        rvEsquemaVacunacionAdultoMujer4.layoutManager = LinearLayoutManager(context)
    }

}

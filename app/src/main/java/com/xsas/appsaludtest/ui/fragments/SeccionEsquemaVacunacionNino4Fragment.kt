package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionNino4
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionNino4Adapter
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_nino4.*

class SeccionEsquemaVacunacionNino4Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_nino4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            EsquemaVacunacionNino4(),
            EsquemaVacunacionNino4(),
            EsquemaVacunacionNino4()
        )

        rvEsquemaVacunacionNino4.adapter = context?.let { EsquemaVacunacionNino4Adapter(vistas, it) }
        rvEsquemaVacunacionNino4.layoutManager = LinearLayoutManager(context)
    }
}

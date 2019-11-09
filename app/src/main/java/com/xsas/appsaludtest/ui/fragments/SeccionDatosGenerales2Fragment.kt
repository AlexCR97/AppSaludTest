package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.ui.adaptadores.DatosGenerales2Adapter
import kotlinx.android.synthetic.main.fragment_seccion_datos_generales2.*

class SeccionDatosGenerales2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_datos_generales2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = ArrayList<Any>()
        vistas.add(1)
        vistas.add(2)
        vistas.add(3)
        vistas.add(4)

        rvDatosGenerales2.adapter = context?.let { DatosGenerales2Adapter(vistas, it) }
        rvDatosGenerales2.layoutManager = LinearLayoutManager(context)
    }
}

package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.ale.appsaludtest.R
import com.ale.appsaludtest.ui.adaptadores.DatosGenerales1Adapter
import kotlinx.android.synthetic.main.fragment_seccion_datos_generales1.*

class SeccionDatosGenerales1Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_datos_generales1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = ArrayList<Any>()
        vistas.add(1)
        vistas.add(2)
        vistas.add(3)
        vistas.add(4)

        rvDatosGenerales1.adapter = context?.let { DatosGenerales1Adapter(vistas, it) }
        rvDatosGenerales1.layoutManager = LinearLayoutManager(context)


    }

}

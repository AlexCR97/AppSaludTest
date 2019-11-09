package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.Otros1
import com.xsas.appsaludtest.ui.adaptadores.Otros1Adapter
import kotlinx.android.synthetic.main.fragment_seccion_otros1.*

class SeccionOtros1Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_otros1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            Otros1(tipoVista = Otros1Adapter.TIPO_ADULTO),
            Otros1(tipoVista = Otros1Adapter.TIPO_BEBE),
            Otros1(tipoVista = Otros1Adapter.TIPO_ADULTO),
            Otros1(tipoVista = Otros1Adapter.TIPO_BEBE)
        )

        rvOtros1.adapter = context?.let { Otros1Adapter(vistas, it) }
        rvOtros1.layoutManager = LinearLayoutManager(context)
    }
}

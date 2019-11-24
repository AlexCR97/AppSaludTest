package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.Otros2
import com.xsas.appsaludtest.ui.adaptadores.Otros2Adapter
import kotlinx.android.synthetic.main.fragment_seccion_otros2.*

class SeccionOtros2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_otros2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vistas = arrayListOf(
            Otros2(),
            Otros2(),
            Otros2(),
            Otros2()
        )

        rvOtros2.adapter = context?.let { Otros2Adapter(vistas, it) }
        rvOtros2.layoutManager = LinearLayoutManager(context)
    }
}

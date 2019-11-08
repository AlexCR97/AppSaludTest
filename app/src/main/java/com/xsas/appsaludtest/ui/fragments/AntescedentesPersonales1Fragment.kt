package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.ui.adaptadores.AntescedentesPersonales1Adapter
import kotlinx.android.synthetic.main.fragment_antescedentes_personales1.*

class AntescedentesPersonales1Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_antescedentes_personales1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val vistas = ArrayList<Any>()
        vistas.add(1)
        vistas.add(1)
        vistas.add(1)

        rvAntescedentes1.adapter = context?.let { AntescedentesPersonales1Adapter(vistas, it) }
        rvAntescedentes1.layoutManager = LinearLayoutManager(context)
    }
}
package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ale.appsaludtest.R
import com.ale.appsaludtest.ui.adaptadores.AntescedentesPersonales1Adapter
import com.ale.appsaludtest.ui.adaptadores.AntescedentesPersonales2Adapter
import com.ale.appsaludtest.ui.adaptadores.AntescedentesPersonales3Adapter
import kotlinx.android.synthetic.main.fragment_antescedentes_personales1.*
import kotlinx.android.synthetic.main.fragment_antescedentes_personales2.*
import kotlinx.android.synthetic.main.fragment_antescedentes_personales3.*

class AntescedentesPersonales3Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_antescedentes_personales3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val vistas = ArrayList<Any>()
        vistas.add(1)
        vistas.add(1)
        vistas.add(1)


        rvAntescedentes3.adapter = context?.let { AntescedentesPersonales3Adapter(vistas, it) }
        rvAntescedentes3.layoutManager = LinearLayoutManager(context)
    }
}
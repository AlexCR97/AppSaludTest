package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ale.appsaludtest.R
import com.ale.appsaludtest.ui.adaptadores.AntescedentesPersonales1Adapter
import com.ale.appsaludtest.ui.adaptadores.Enfermedades2Adapter
import kotlinx.android.synthetic.main.fragment_antescedentes_personales1.*
import kotlinx.android.synthetic.main.fragment_enfermedades1.*
import kotlinx.android.synthetic.main.fragment_enfermedades2.*

class Enfermedades2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_enfermedades2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val vistas = ArrayList<Any>()
        vistas.add(1)
        vistas.add(1)
        vistas.add(1)

        rvEnfermedades2.adapter = context?.let { Enfermedades2Adapter(vistas, it) }
        rvEnfermedades2.layoutManager = LinearLayoutManager(context)
    }
}
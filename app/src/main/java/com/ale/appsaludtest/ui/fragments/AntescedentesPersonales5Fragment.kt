package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ale.appsaludtest.R
import com.ale.appsaludtest.ui.adaptadores.AntescedentesPersonales5Adapter
import kotlinx.android.synthetic.main.fragment_antescedentes_personales5.*

class AntescedentesPersonales5Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_antescedentes_personales5, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val vistas = ArrayList<Any>()
        vistas.add(1)
        vistas.add(1)
        vistas.add(1)

        rvAntescedentes5.adapter = context?.let { AntescedentesPersonales5Adapter(vistas, it) }
        rvAntescedentes5.layoutManager = LinearLayoutManager(context)
    }
}
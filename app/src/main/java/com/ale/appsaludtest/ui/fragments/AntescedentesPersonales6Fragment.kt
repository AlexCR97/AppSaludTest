package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ale.appsaludtest.R
import com.ale.appsaludtest.ui.adaptadores.*
import kotlinx.android.synthetic.main.fragment_antescedentes_personales1.*
import kotlinx.android.synthetic.main.fragment_antescedentes_personales2.*
import kotlinx.android.synthetic.main.fragment_antescedentes_personales3.*
import kotlinx.android.synthetic.main.fragment_antescedentes_personales5.*
import kotlinx.android.synthetic.main.fragment_antescedentes_personales6.*

class AntescedentesPersonales6Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_antescedentes_personales6, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val vistas = ArrayList<Any>()
        vistas.add(1)
        vistas.add(1)
        vistas.add(1)

        rvAntescedentes6.adapter = context?.let { AntescedentesPersonales6Adapter(vistas, it) }
        rvAntescedentes6.layoutManager = LinearLayoutManager(context)
    }
}
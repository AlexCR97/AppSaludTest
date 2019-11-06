package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.ui.adaptadores.AntescedentesPersonales4Adapter
import kotlinx.android.synthetic.main.fragment_antescedentes_personales4.*

class AntescedentesPersonales4Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_antescedentes_personales4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val vistas = ArrayList<Any>()
        vistas.add(1)

        rvAntescedentes4.adapter = context?.let { AntescedentesPersonales4Adapter(vistas, it) }
        rvAntescedentes4.layoutManager = LinearLayoutManager(context)
    }
}
package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ale.appsaludtest.R
import com.ale.appsaludtest.ui.adaptadores.AntescedentesPersonales1Adapter
import com.ale.appsaludtest.ui.adaptadores.Cancer1Adapter
import com.ale.appsaludtest.ui.adaptadores.Nose1Adapter
import kotlinx.android.synthetic.main.fragment_antescedentes_personales1.*
import kotlinx.android.synthetic.main.fragment_cancer1.*
import kotlinx.android.synthetic.main.fragment_nose1.*

class Cancer1Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_cancer1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val vistas = ArrayList<Any>()
        vistas.add(1)
        vistas.add(1)
        vistas.add(1)

        rvCancer1.adapter = context?.let { Cancer1Adapter(vistas, it) }
        rvCancer1.layoutManager = LinearLayoutManager(context)
    }
}
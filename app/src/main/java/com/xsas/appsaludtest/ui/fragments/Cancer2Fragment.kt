package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.ui.adaptadores.Cancer2Adapter
import kotlinx.android.synthetic.main.fragment_cancer2.*

class Cancer2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_cancer2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val vistas = ArrayList<Any>()
        vistas.add(1)
        vistas.add(1)
        vistas.add(1)


        rvCancer2.adapter = context?.let { Cancer2Adapter(vistas, it) }
        rvCancer2.layoutManager = LinearLayoutManager(context)
    }
}
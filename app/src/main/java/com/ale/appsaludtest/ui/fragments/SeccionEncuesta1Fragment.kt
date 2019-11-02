package com.ale.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager

import com.ale.appsaludtest.R
import com.ale.appsaludtest.ui.adaptadores.DatosPersonalesAdapter
import com.ale.appsaludtest.ui.modelos.EncuestaViewModel
import kotlinx.android.synthetic.main.fragment_seccion_encuesta1.*

class SeccionEncuesta1Fragment : Fragment() {

    private lateinit var viewModel: EncuestaViewModel
    private lateinit var nav: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_encuesta1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = activity?.let { ViewModelProviders.of(it)[EncuestaViewModel::class.java] }!!

        rvDatosPersonales.adapter = context?.let { DatosPersonalesAdapter(viewModel.getIntegrantes(), it) }
        rvDatosPersonales.layoutManager = LinearLayoutManager(context)

        viewModel.getCantidadIntegrantes().observe(viewLifecycleOwner, Observer {
            tvCantidadIntegrantes.text = it.toString()
            rvDatosPersonales.adapter?.notifyDataSetChanged()
        })

        bMenos.setOnClickListener {
            viewModel.quitarIntegrante()
        }

        bMas.setOnClickListener {
            viewModel.agregarIntegrante()
        }

        viewModel.agregarIntegrante()
    }
}

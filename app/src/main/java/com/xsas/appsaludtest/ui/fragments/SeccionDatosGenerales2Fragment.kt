package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.DatosGenerales2
import com.xsas.appsaludtest.ui.EncuestaSingleton
import com.xsas.appsaludtest.ui.adaptadores.DatosGenerales2Adapter
import com.xsas.appsaludtest.ui.modelos.SeccionDatosGeneralesViewModel
import kotlinx.android.synthetic.main.fragment_seccion_datos_generales2.*

class SeccionDatosGenerales2Fragment : Fragment() {

    private lateinit var viewModel: SeccionDatosGeneralesViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_datos_generales2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cargarViewModel()
        cargarVistas()
    }

    private fun cargarViewModel() {
        viewModel = ViewModelProviders.of(activity!!)[SeccionDatosGeneralesViewModel::class.java]
    }

    private fun cargarVistas() {
        for (i in 0 until EncuestaSingleton.cantidadIntegrantes) {
            viewModel.agregarDatosGenerales2(DatosGenerales2())
        }

        Log.e("salud", "Datos generales 2: " + viewModel.getDatosGenerales2().toString())

        rvDatosGenerales2.adapter = context?.let { DatosGenerales2Adapter(viewModel.getDatosGenerales2(), it, viewModel) }
        rvDatosGenerales2.layoutManager = LinearLayoutManager(context)
    }
}

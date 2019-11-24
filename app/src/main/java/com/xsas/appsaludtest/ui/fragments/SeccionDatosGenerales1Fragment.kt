package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.vistas.DatosGenerales1
import com.xsas.appsaludtest.ui.EncuestaSingleton
import com.xsas.appsaludtest.ui.actividades.SeccionDatosGeneralesActivity
import com.xsas.appsaludtest.ui.adaptadores.DatosGenerales1Adapter
import com.xsas.appsaludtest.ui.modelos.SeccionDatosGeneralesViewModel
import kotlinx.android.synthetic.main.fragment_seccion_datos_generales1.*

class SeccionDatosGenerales1Fragment : Fragment() {

    private lateinit var viewModel: SeccionDatosGeneralesViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_datos_generales1, container, false)
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
            viewModel.agregarDatosGenerales1(DatosGenerales1())
        }

        rvDatosGenerales1.adapter = context?.let { DatosGenerales1Adapter(viewModel.getDatosGenerales1(), it, viewModel) }
        rvDatosGenerales1.layoutManager = LinearLayoutManager(context)
    }
}

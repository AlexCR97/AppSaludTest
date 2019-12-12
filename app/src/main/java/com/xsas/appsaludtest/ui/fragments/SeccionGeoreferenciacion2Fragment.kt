package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.ViewModelProviders

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.entidades.Municipio
import com.xsas.appsaludtest.ui.ConsultasGlobales
import com.xsas.appsaludtest.ui.cambiarHabilitado
import com.xsas.appsaludtest.ui.listToArray
import com.xsas.appsaludtest.ui.modelos.SeccionGeoreferenciacionViewModel
import kotlinx.android.synthetic.main.fragment_seccion_georeferenciacion2.*

class SeccionGeoreferenciacion2Fragment : Fragment() {

    private lateinit var viewModel: SeccionGeoreferenciacionViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_georeferenciacion2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cargarViewModel()

        llenarLocalidadesColonias(viewModel.georeferenciacion1.municipio)

        bConfirmar.setOnClickListener {
            actualizarDatosViewModel()
            cambiarHabilitado(llCamposGeoreferenciacion2)
        }
    }

    private fun actualizarDatosViewModel() {
        viewModel.georeferenciacion2.codigoPostal = etCodigoPostal.text.toString()
        viewModel.georeferenciacion2.localidad = sLocalidadColonia.selectedItem.toString()
        viewModel.georeferenciacion2.calle = etCalle.text.toString()
        viewModel.georeferenciacion2.numeroExterior = etNoExterior.text.toString()
        viewModel.georeferenciacion2.numeroInterior = etNoInterior.text.toString()
    }

    private fun cargarViewModel() {
        viewModel = ViewModelProviders.of(activity!!)[SeccionGeoreferenciacionViewModel::class.java]
    }

    private fun llenarLocalidadesColonias(municipio: String) {
        val localidades = ConsultasGlobales.localidades[municipio]
        sLocalidadColonia.adapter = context?.let { ArrayAdapter(it, android.R.layout.simple_spinner_item, listToArray(localidades!!)) }
    }
}

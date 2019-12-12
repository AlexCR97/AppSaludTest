package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.ui.cambiarHabilitado
import com.xsas.appsaludtest.ui.modelos.SeccionGeoreferenciacionViewModel
import kotlinx.android.synthetic.main.fragment_seccion_georeferenciacion3.*

class SeccionGeoreferenciacion3Fragment : Fragment() {

    private lateinit var viewModel: SeccionGeoreferenciacionViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_georeferenciacion3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cargarViewModel()

        bConfirmar.setOnClickListener {
            actualizarDatosViewModel()
            cambiarHabilitado(llCamposGeoreferenciacion3)
        }
    }

    private fun actualizarDatosViewModel() {
        viewModel.georeferenciacion3.telefono = etTelefonoCasa.text.toString()
        viewModel.georeferenciacion3.referenciaUbicacion = etReferenciaUbicacion.text.toString()
    }

    private fun cargarViewModel() {
        viewModel = ViewModelProviders.of(activity!!)[SeccionGeoreferenciacionViewModel::class.java]
    }
}

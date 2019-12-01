package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.datos.otros.TipoCartilla
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAnciano2
import com.xsas.appsaludtest.ui.EncuestaSingleton
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionAnciano2Adapter
import com.xsas.appsaludtest.ui.modelos.SeccionEsquemaVacunacionAncianoViewModel
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_anciano2.*

class SeccionEsquemaVacunacionAnciano2Fragment : Fragment() {

    private lateinit var viewModel: SeccionEsquemaVacunacionAncianoViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_anciano2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cargarViewModel()
        cargarVistas()
    }

    private fun cargarViewModel() {
        viewModel = ViewModelProviders.of(activity!!)[SeccionEsquemaVacunacionAncianoViewModel::class.java]
    }

    private fun cargarVistas() {
        for (integrante in EncuestaSingleton.integrantesEsquemas) {
            if (integrante.tipoCartilla == TipoCartilla.ADULTO_MAYOR) {
                viewModel.agregarEsquemaVacunacionAnciano2(EsquemaVacunacionAnciano2())
            }
        }

        rvEsquemaVacunacionAnciano2.adapter = context?.let { EsquemaVacunacionAnciano2Adapter(viewModel.getEsquemaVacunacionAnciano2(), it) }
        rvEsquemaVacunacionAnciano2.layoutManager = LinearLayoutManager(context)
    }

}

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
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAnciano3
import com.xsas.appsaludtest.ui.EncuestaSingleton
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionAnciano3Adapter
import com.xsas.appsaludtest.ui.modelos.SeccionEsquemaVacunacionAncianoViewModel
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_anciano3.*

class SeccionEsquemaVacunacionAnciano3Fragment : Fragment() {

    private lateinit var viewModel: SeccionEsquemaVacunacionAncianoViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_anciano3, container, false)
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
                viewModel.agregarEsquemaVacunacionAnciano3(EsquemaVacunacionAnciano3())
            }
        }

        rvEsquemaVacunacionAnciano3.adapter = context?.let { EsquemaVacunacionAnciano3Adapter(viewModel.getEsquemaVacunacionAnciano3(), it) }
        rvEsquemaVacunacionAnciano3.layoutManager = LinearLayoutManager(context)
    }
}

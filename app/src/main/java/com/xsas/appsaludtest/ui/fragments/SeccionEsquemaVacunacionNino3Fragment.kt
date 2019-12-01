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
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionNino3
import com.xsas.appsaludtest.ui.EncuestaSingleton
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionNino3Adapter
import com.xsas.appsaludtest.ui.modelos.SeccionEsquemaVacunacionNinoViewModel
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_nino3.*

class SeccionEsquemaVacunacionNino3Fragment : Fragment() {

    private lateinit var viewModel: SeccionEsquemaVacunacionNinoViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_nino3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cargarViewModel()
        cargarVistas()
    }

    private fun cargarViewModel() {
        viewModel = ViewModelProviders.of(activity!!)[SeccionEsquemaVacunacionNinoViewModel::class.java]
    }

    private fun cargarVistas() {
        for (integrante in EncuestaSingleton.integrantesEsquemas) {
            if (integrante.tipoCartilla == TipoCartilla.NINO) {
                viewModel.agregarEsquemaVacunacionNino3(EsquemaVacunacionNino3())
            }
        }

        rvEsquemaVacunacionNino3.adapter = context?.let { EsquemaVacunacionNino3Adapter(viewModel.getEsquemasVacunacionNino3(), it) }
        rvEsquemaVacunacionNino3.layoutManager = LinearLayoutManager(context)
    }
}

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
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoHombre3
import com.xsas.appsaludtest.ui.EncuestaSingleton
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionAdultoHombre3Adapter
import com.xsas.appsaludtest.ui.modelos.SeccionEsquemaVacunacionAdultoHombreViewModel
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_adulto_hombre3.*

class SeccionEsquemaVacunacionAdultoHombre3Fragment : Fragment() {

    private lateinit var viewModel: SeccionEsquemaVacunacionAdultoHombreViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_adulto_hombre3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cargarViewModel()
        cargarVistas()
    }

    private fun cargarViewModel() {
        viewModel = ViewModelProviders.of(activity!!)[SeccionEsquemaVacunacionAdultoHombreViewModel::class.java]
    }

    private fun cargarVistas() {
        for (integrante in EncuestaSingleton.integrantesEsquemas) {
            if (integrante.tipoCartilla == TipoCartilla.ADULTO_HOMBRE) {
                viewModel.agregarEsquemaVacunacionAdultoHombre3(EsquemaVacunacionAdultoHombre3())
            }
        }

        rvEsquemaVacunacionAdultoHombre3.adapter = context?.let { EsquemaVacunacionAdultoHombre3Adapter(viewModel.getEsquemaVacunacionAdultoHombre3(), it) }
        rvEsquemaVacunacionAdultoHombre3.layoutManager = LinearLayoutManager(context)
    }
}

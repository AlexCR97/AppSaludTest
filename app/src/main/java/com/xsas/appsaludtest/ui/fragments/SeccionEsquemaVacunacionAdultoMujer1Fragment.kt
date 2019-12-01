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
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoMujer1
import com.xsas.appsaludtest.ui.EncuestaSingleton
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionAdultoMujer1Adapter
import com.xsas.appsaludtest.ui.modelos.SeccionEsquemaVacunacionAdultoMujerViewModel
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_adulto_mujer1.*

class SeccionEsquemaVacunacionAdultoMujer1Fragment : Fragment() {

    private lateinit var viewModel: SeccionEsquemaVacunacionAdultoMujerViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_adulto_mujer1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cargarViewModel()
        cargarVistas()
    }

    private fun cargarViewModel() {
        viewModel = ViewModelProviders.of(activity!!)[SeccionEsquemaVacunacionAdultoMujerViewModel::class.java]
    }

    private fun cargarVistas() {
        for (integrante in EncuestaSingleton.integrantesEsquemas) {
            if (integrante.tipoCartilla == TipoCartilla.ADULTO_MUJER) {
                viewModel.agregarEsquemaVacunacionAdultoMujer1(EsquemaVacunacionAdultoMujer1())
            }
        }

        rvEsquemaVacunacionAdultoMujer1.adapter = context?.let { EsquemaVacunacionAdultoMujer1Adapter(viewModel.getEsquemaVacunacionAdultoMujer1(), it) }
        rvEsquemaVacunacionAdultoMujer1.layoutManager = LinearLayoutManager(context)
    }
}

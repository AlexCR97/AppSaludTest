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
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente4
import com.xsas.appsaludtest.ui.EncuestaSingleton
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionAdolescente4Adapter
import com.xsas.appsaludtest.ui.modelos.SeccionEsquemaVacunacionAdolescenteViewModel
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_adolescente4.*

class SeccionEsquemaVacunacionAdolescente4Fragment : Fragment() {

    private lateinit var viewModel: SeccionEsquemaVacunacionAdolescenteViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_adolescente4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cargarViewModel()
        cargarVistas()
    }

    private fun cargarViewModel() {
        viewModel = ViewModelProviders.of(activity!!)[SeccionEsquemaVacunacionAdolescenteViewModel::class.java]
    }

    private fun cargarVistas() {
        for (integrante in EncuestaSingleton.integrantesEsquemas) {
            if (integrante.tipoCartilla == TipoCartilla.ADOLESCENTE) {
                viewModel.agregarEsquemaVacunacionAdolescente4(EsquemaVacunacionAdolescente4())
            }
        }

        rvEsquemaVacunacionAdolescente4.adapter = context?.let { EsquemaVacunacionAdolescente4Adapter(viewModel.getEsquemasVacunacionAdolescente4(), it) }
        rvEsquemaVacunacionAdolescente4.layoutManager = LinearLayoutManager(context)
    }
}

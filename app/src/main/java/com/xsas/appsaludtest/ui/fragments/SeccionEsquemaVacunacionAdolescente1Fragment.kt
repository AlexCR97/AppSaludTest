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
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente1
import com.xsas.appsaludtest.ui.EncuestaSingleton
import com.xsas.appsaludtest.ui.adaptadores.EsquemaVacunacionAdolescente1Adapter
import com.xsas.appsaludtest.ui.modelos.SeccionEsquemaVacunacionAdolescenteViewModel
import kotlinx.android.synthetic.main.fragment_seccion_esquema_vacunacion_adolescente1.*

class SeccionEsquemaVacunacionAdolescente1Fragment : Fragment() {

    private lateinit var viewModel: SeccionEsquemaVacunacionAdolescenteViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_esquema_vacunacion_adolescente1, container, false)
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
                viewModel.agregarEsquemaVacunacionAdolescente1(EsquemaVacunacionAdolescente1())
            }
        }

        rvEsquemaVacunacionAdolescente1.adapter = context?.let { EsquemaVacunacionAdolescente1Adapter(viewModel.getEsquemasVacunacionAdolescente1(), it) }
        rvEsquemaVacunacionAdolescente1.layoutManager = LinearLayoutManager(context)
    }
}

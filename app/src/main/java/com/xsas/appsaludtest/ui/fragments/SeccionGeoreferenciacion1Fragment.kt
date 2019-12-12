package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.lifecycle.ViewModelProviders

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.ui.ConsultasGlobales
import com.xsas.appsaludtest.ui.cambiarHabilitado
import com.xsas.appsaludtest.ui.listToArray
import com.xsas.appsaludtest.ui.modelos.SeccionGeoreferenciacionViewModel
import kotlinx.android.synthetic.main.fragment_seccion_georeferenciacion1.*

class SeccionGeoreferenciacion1Fragment : Fragment() {

    private lateinit var viewModel: SeccionGeoreferenciacionViewModel

    private lateinit var jurisdicciones: List<String>
    private lateinit var municipios: List<String>
    private lateinit var centrosSalud: List<String>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_georeferenciacion1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cargarViewModel()

        llenarJurisdicciones()

        sJurisdicciones.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) { }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {
                val jurisdiccionSeleccionada: String = jurisdicciones[position]
                viewModel.georeferenciacion1.jurisdiccion = jurisdiccionSeleccionada
            }
        }

        sMunicipios.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) { }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {
                val municipioSeleccionado: String = municipios[position]
                viewModel.georeferenciacion1.municipio = municipioSeleccionado
                llenarCentrosSalud(municipioSeleccionado)
            }
        }

        sCentroSalud.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) { }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {
                val centroSaludSeleccionado: String = centrosSalud[position]
                viewModel.georeferenciacion1.centroSalud = centroSaludSeleccionado
            }
        }

        bConfirmar.setOnClickListener {
            actualizarDatosViewModel()
            cambiarHabilitado(llCamposGeoreferenciacion1)
        }
    }

    private fun actualizarDatosViewModel() {
        viewModel.georeferenciacion1.jurisdiccion = sJurisdicciones.selectedItem.toString()
        viewModel.georeferenciacion1.municipio = sMunicipios.selectedItem.toString()
        viewModel.georeferenciacion1.centroSalud = sCentroSalud.selectedItem.toString()
    }

    private fun cargarViewModel() {
        viewModel = ViewModelProviders.of(activity!!)[SeccionGeoreferenciacionViewModel::class.java]
    }

    private fun llenarJurisdicciones() {
        jurisdicciones = ConsultasGlobales.jurisdicciones.keys.toList()
        sJurisdicciones.adapter = context?.let { ArrayAdapter(it, android.R.layout.simple_spinner_item, listToArray(jurisdicciones)) }

        llenarMunicipios(jurisdicciones[0])
    }

    private fun llenarMunicipios(jurisdiccion: String) {
        municipios = ConsultasGlobales.jurisdicciones[jurisdiccion]!!.keys.toList()
        sMunicipios.adapter = context?.let { ArrayAdapter(it, android.R.layout.simple_spinner_item, listToArray(municipios)) }

        llenarCentrosSalud(municipios[0])
    }

    private fun llenarCentrosSalud(municipio: String) {
        centrosSalud = ConsultasGlobales.municipios[municipio]!!
        sCentroSalud.adapter = context?.let { ArrayAdapter(it, android.R.layout.simple_spinner_item, listToArray(centrosSalud)) }
    }
}

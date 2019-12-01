package com.xsas.appsaludtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner

import com.xsas.appsaludtest.R
import com.xsas.appsaludtest.ui.ConsultasGlobales
import com.xsas.appsaludtest.ui.listToArray
import kotlinx.android.synthetic.main.fragment_seccion_georeferenciacion1.*

class SeccionGeoreferenciacion1Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_seccion_georeferenciacion1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val jurisdicciones = listToArray(ConsultasGlobales.jurisdicciones)
        sJurisdicciones.adapter = ArrayAdapter(view.context, android.R.layout.simple_spinner_item, jurisdicciones)

        val municipios = listToArray(ConsultasGlobales.municipios)
        sMunicipios.adapter = ArrayAdapter(view.context, android.R.layout.simple_spinner_item, municipios)

        val centrosSalud = listToArray(ConsultasGlobales.centrosSalud)
        sCentroSalud.adapter = ArrayAdapter(view.context, android.R.layout.simple_spinner_item, centrosSalud)
    }

}

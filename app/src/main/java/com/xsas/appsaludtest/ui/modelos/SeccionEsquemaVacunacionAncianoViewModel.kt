package com.xsas.appsaludtest.ui.modelos

import androidx.lifecycle.ViewModel
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAnciano1
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAnciano2
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAnciano3

class SeccionEsquemaVacunacionAncianoViewModel : ViewModel() {

    private val esquemasVacunacionAnciano1 = arrayListOf<EsquemaVacunacionAnciano1>()
    private val esquemasVacunacionAnciano2 = arrayListOf<EsquemaVacunacionAnciano2>()
    private val esquemasVacunacionAnciano3 = arrayListOf<EsquemaVacunacionAnciano3>()

    fun agregarEsquemaVacunacionAnciano1(esquemaVacunacionAnciano1: EsquemaVacunacionAnciano1) {
        esquemasVacunacionAnciano1.add(esquemaVacunacionAnciano1)
    }

    fun agregarEsquemaVacunacionAnciano2(esquemaVacunacionAnciano2: EsquemaVacunacionAnciano2) {
        esquemasVacunacionAnciano2.add(esquemaVacunacionAnciano2)
    }

    fun agregarEsquemaVacunacionAnciano3(esquemaVacunacionAnciano3: EsquemaVacunacionAnciano3) {
        esquemasVacunacionAnciano3.add(esquemaVacunacionAnciano3)
    }

    fun getEsquemaVacunacionAnciano1(): ArrayList<EsquemaVacunacionAnciano1> {
        return esquemasVacunacionAnciano1
    }

    fun getEsquemaVacunacionAnciano2(): ArrayList<EsquemaVacunacionAnciano2> {
        return esquemasVacunacionAnciano2
    }

    fun getEsquemaVacunacionAnciano3(): ArrayList<EsquemaVacunacionAnciano3> {
        return esquemasVacunacionAnciano3
    }

}

package com.xsas.appsaludtest.ui.modelos

import androidx.lifecycle.ViewModel
import com.xsas.appsaludtest.datos.vistas.*

class SeccionEsquemaVacunacionNinoViewModel : ViewModel() {

    private val esquemasVacunacionNino1 = arrayListOf<EsquemaVacunacionNino1>()
    private val esquemasVacunacionNino2 = arrayListOf<EsquemaVacunacionNino2>()
    private val esquemasVacunacionNino3 = arrayListOf<EsquemaVacunacionNino3>()
    private val esquemasVacunacionNino4 = arrayListOf<EsquemaVacunacionNino4>()
    private val esquemasVacunacionNino5 = arrayListOf<EsquemaVacunacionNino5>()

    fun agregarEsquemaVacunacionNino1(esquemaVacunacionNino1: EsquemaVacunacionNino1) {
        esquemasVacunacionNino1.add(esquemaVacunacionNino1)
    }

    fun agregarEsquemaVacunacionNino2(esquemaVacunacionNino2: EsquemaVacunacionNino2) {
        esquemasVacunacionNino2.add(esquemaVacunacionNino2)
    }

    fun agregarEsquemaVacunacionNino3(esquemaVacunacionNino3: EsquemaVacunacionNino3) {
        esquemasVacunacionNino3.add(esquemaVacunacionNino3)
    }

    fun agregarEsquemaVacunacionNino4(esquemaVacunacionNino4: EsquemaVacunacionNino4) {
        esquemasVacunacionNino4.add(esquemaVacunacionNino4)
    }

    fun agregarEsquemaVacunacionNino5(esquemaVacunacionNino5: EsquemaVacunacionNino5) {
        esquemasVacunacionNino5.add(esquemaVacunacionNino5)
    }

    fun getEsquemasVacunacionNino1(): ArrayList<EsquemaVacunacionNino1> {
        return esquemasVacunacionNino1
    }

    fun getEsquemasVacunacionNino2(): ArrayList<EsquemaVacunacionNino2> {
        return esquemasVacunacionNino2
    }

    fun getEsquemasVacunacionNino3(): ArrayList<EsquemaVacunacionNino3> {
        return esquemasVacunacionNino3
    }

    fun getEsquemasVacunacionNino4(): ArrayList<EsquemaVacunacionNino4> {
        return esquemasVacunacionNino4
    }

    fun getEsquemasVacunacionNino5(): ArrayList<EsquemaVacunacionNino5> {
        return esquemasVacunacionNino5
    }
}

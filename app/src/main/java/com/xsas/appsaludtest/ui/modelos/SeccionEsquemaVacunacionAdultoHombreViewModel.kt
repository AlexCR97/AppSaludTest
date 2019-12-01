package com.xsas.appsaludtest.ui.modelos

import androidx.lifecycle.ViewModel
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoHombre1
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoHombre2
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoHombre3

class SeccionEsquemaVacunacionAdultoHombreViewModel : ViewModel() {

    private val esquemasVacunacionAdultoHombre1 = arrayListOf<EsquemaVacunacionAdultoHombre1>()
    private val esquemasVacunacionAdultoHombre2 = arrayListOf<EsquemaVacunacionAdultoHombre2>()
    private val esquemasVacunacionAdultoHombre3 = arrayListOf<EsquemaVacunacionAdultoHombre3>()

    fun agregarEsquemaVacunacionAdultoHombre1(esquemaVacunacionAdultoHombre1: EsquemaVacunacionAdultoHombre1) {
        esquemasVacunacionAdultoHombre1.add(esquemaVacunacionAdultoHombre1)
    }

    fun agregarEsquemaVacunacionAdultoHombre2(esquemaVacunacionAdultoHombre2: EsquemaVacunacionAdultoHombre2) {
        esquemasVacunacionAdultoHombre2.add(esquemaVacunacionAdultoHombre2)
    }

    fun agregarEsquemaVacunacionAdultoHombre3(esquemaVacunacionAdultoHombre3: EsquemaVacunacionAdultoHombre3) {
        esquemasVacunacionAdultoHombre3.add(esquemaVacunacionAdultoHombre3)
    }

    fun getEsquemaVacunacionAdultoHombre1(): ArrayList<EsquemaVacunacionAdultoHombre1> {
        return esquemasVacunacionAdultoHombre1
    }

    fun getEsquemaVacunacionAdultoHombre2(): ArrayList<EsquemaVacunacionAdultoHombre2> {
        return esquemasVacunacionAdultoHombre2
    }

    fun getEsquemaVacunacionAdultoHombre3(): ArrayList<EsquemaVacunacionAdultoHombre3> {
        return esquemasVacunacionAdultoHombre3
    }

}

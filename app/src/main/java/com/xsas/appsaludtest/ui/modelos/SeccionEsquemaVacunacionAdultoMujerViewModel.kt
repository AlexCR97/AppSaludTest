package com.xsas.appsaludtest.ui.modelos

import androidx.lifecycle.ViewModel
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoMujer1
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoMujer2
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoMujer3
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoMujer4

class SeccionEsquemaVacunacionAdultoMujerViewModel : ViewModel() {

    private val esquemasVacunacionAdultoMujer1 = arrayListOf<EsquemaVacunacionAdultoMujer1>()
    private val esquemasVacunacionAdultoMujer2 = arrayListOf<EsquemaVacunacionAdultoMujer2>()
    private val esquemasVacunacionAdultoMujer3 = arrayListOf<EsquemaVacunacionAdultoMujer3>()
    private val esquemasVacunacionAdultoMujer4 = arrayListOf<EsquemaVacunacionAdultoMujer4>()

    fun agregarEsquemaVacunacionAdultoMujer1(esquemaVacunacionAdultoMujer1: EsquemaVacunacionAdultoMujer1) {
        esquemasVacunacionAdultoMujer1.add(esquemaVacunacionAdultoMujer1)
    }

    fun agregarEsquemaVacunacionAdultoMujer2(esquemaVacunacionAdultoMujer2: EsquemaVacunacionAdultoMujer2) {
        esquemasVacunacionAdultoMujer2.add(esquemaVacunacionAdultoMujer2)
    }

    fun agregarEsquemaVacunacionAdultoMujer3(esquemaVacunacionAdultoMujer3: EsquemaVacunacionAdultoMujer3) {
        esquemasVacunacionAdultoMujer3.add(esquemaVacunacionAdultoMujer3)
    }

    fun agregarEsquemaVacunacionAdultoMujer4(esquemaVacunacionAdultoMujer4: EsquemaVacunacionAdultoMujer4) {
        esquemasVacunacionAdultoMujer4.add(esquemaVacunacionAdultoMujer4)
    }

    fun getEsquemaVacunacionAdultoMujer1(): ArrayList<EsquemaVacunacionAdultoMujer1> {
        return esquemasVacunacionAdultoMujer1
    }

    fun getEsquemaVacunacionAdultoMujer2(): ArrayList<EsquemaVacunacionAdultoMujer2> {
        return esquemasVacunacionAdultoMujer2
    }

    fun getEsquemaVacunacionAdultoMujer3(): ArrayList<EsquemaVacunacionAdultoMujer3> {
        return esquemasVacunacionAdultoMujer3
    }

    fun getEsquemaVacunacionAdultoMujer4(): ArrayList<EsquemaVacunacionAdultoMujer4> {
        return esquemasVacunacionAdultoMujer4
    }

}

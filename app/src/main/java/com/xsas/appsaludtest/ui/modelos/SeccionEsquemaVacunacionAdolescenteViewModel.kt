package com.xsas.appsaludtest.ui.modelos

import androidx.lifecycle.ViewModel
import com.xsas.appsaludtest.datos.vistas.*

class SeccionEsquemaVacunacionAdolescenteViewModel : ViewModel() {

    private val esquemasVacunacionAdolescente1 = arrayListOf<EsquemaVacunacionAdolescente1>()
    private val esquemasVacunacionAdolescente2 = arrayListOf<EsquemaVacunacionAdolescente2>()
    private val esquemasVacunacionAdolescente3 = arrayListOf<EsquemaVacunacionAdolescente3>()
    private val esquemasVacunacionAdolescente4 = arrayListOf<EsquemaVacunacionAdolescente4>()
    private val esquemasVacunacionAdolescente5 = arrayListOf<EsquemaVacunacionAdolescente5>()
    private val esquemasVacunacionAdolescente6 = arrayListOf<EsquemaVacunacionAdolescente6>()

    fun agregarEsquemaVacunacionAdolescente1(esquemaVacunacionAdolescente1: EsquemaVacunacionAdolescente1) {
        esquemasVacunacionAdolescente1.add(esquemaVacunacionAdolescente1)
    }

    fun agregarEsquemaVacunacionAdolescente2(esquemaVacunacionAdolescente2: EsquemaVacunacionAdolescente2) {
        esquemasVacunacionAdolescente2.add(esquemaVacunacionAdolescente2)
    }

    fun agregarEsquemaVacunacionAdolescente3(esquemaVacunacionAdolescente3: EsquemaVacunacionAdolescente3) {
        esquemasVacunacionAdolescente3.add(esquemaVacunacionAdolescente3)
    }

    fun agregarEsquemaVacunacionAdolescente4(esquemaVacunacionAdolescente4: EsquemaVacunacionAdolescente4) {
        esquemasVacunacionAdolescente4.add(esquemaVacunacionAdolescente4)
    }

    fun agregarEsquemaVacunacionAdolescente5(esquemaVacunacionAdolescente5: EsquemaVacunacionAdolescente5) {
        esquemasVacunacionAdolescente5.add(esquemaVacunacionAdolescente5)
    }

    fun agregarEsquemaVacunacionAdolescente6(esquemaVacunacionAdolescente6: EsquemaVacunacionAdolescente6) {
        esquemasVacunacionAdolescente6.add(esquemaVacunacionAdolescente6)
    }

    fun getEsquemasVacunacionAdolescente1(): ArrayList<EsquemaVacunacionAdolescente1> {
        return esquemasVacunacionAdolescente1
    }

    fun getEsquemasVacunacionAdolescente2(): ArrayList<EsquemaVacunacionAdolescente2> {
        return esquemasVacunacionAdolescente2
    }

    fun getEsquemasVacunacionAdolescente3(): ArrayList<EsquemaVacunacionAdolescente3> {
        return esquemasVacunacionAdolescente3
    }

    fun getEsquemasVacunacionAdolescente4(): ArrayList<EsquemaVacunacionAdolescente4> {
        return esquemasVacunacionAdolescente4
    }

    fun getEsquemasVacunacionAdolescente5(): ArrayList<EsquemaVacunacionAdolescente5> {
        return esquemasVacunacionAdolescente5
    }

    fun getEsquemasVacunacionAdolescente6(): ArrayList<EsquemaVacunacionAdolescente6> {
        return esquemasVacunacionAdolescente6
    }

}

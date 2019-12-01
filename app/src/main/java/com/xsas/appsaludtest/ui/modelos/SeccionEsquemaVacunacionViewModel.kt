package com.xsas.appsaludtest.ui.modelos

import androidx.lifecycle.ViewModel
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacion

class SeccionEsquemaVacunacionViewModel : ViewModel() {

    private val esquemas = arrayListOf<EsquemaVacunacion>()

    fun agregarEsquemaVacunacion(esquemaVacunacion: EsquemaVacunacion) {
        esquemas.add(esquemaVacunacion)
    }

    fun quitarEsquemasVacunacion() {
        esquemas.removeAt(esquemas.size - 1)
    }

    fun getEsquemasVacunacion(): ArrayList<EsquemaVacunacion> {
        return esquemas
    }
}

package com.xsas.appsaludtest.ui.modelos

import androidx.lifecycle.ViewModel
import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacion

class SeccionEsquemaVacunacionModel : ViewModel() {

    private val esquemas = linkedMapOf<String, EsquemaVacunacion>()

    fun agregarEsquemaVacunacion(nombreIntegrante: String, esquemaVacunacion: EsquemaVacunacion) {
        esquemas[nombreIntegrante] = esquemaVacunacion
    }

    fun quitarEsquemasVacunacion(nombreIntegrante: String) {
        esquemas.remove(nombreIntegrante)
    }

    fun getEsquemasVacunacion(): LinkedHashMap<String, EsquemaVacunacion> {
        return esquemas
    }
}

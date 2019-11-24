package com.xsas.appsaludtest.ui.modelos

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CantidadIntegrantesViewModel : ViewModel() {

    private val cantidadIntegrantes = MutableLiveData<Int>()

    fun getCantidadIntegrantes(): MutableLiveData<Int> = cantidadIntegrantes

    fun agregarIntegrante() {
        if (cantidadIntegrantes.value == null)
            cantidadIntegrantes.value = 1

        val cantidadActual: Int = cantidadIntegrantes.value!!
        cantidadIntegrantes.value = cantidadActual + 1
    }

    fun quitarIntegrante() {
        val cantidadActual: Int = cantidadIntegrantes.value!!

        if (cantidadActual <= 1)
            return

        cantidadIntegrantes.value = cantidadActual - 1
    }
}

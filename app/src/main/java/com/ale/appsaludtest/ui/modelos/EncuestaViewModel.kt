package com.ale.appsaludtest.ui.modelos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ale.appsaludtest.datos.vistas.DatosPersonales

class EncuestaViewModel : ViewModel() {

    private val cantidadIntegrantes = MutableLiveData<Int>()
    private val integrantes = ArrayList<DatosPersonales>()

    fun agregarIntegrante() {

        val nuevaCantidadIntegrantes = integrantes.size + 1

        val datosPersonales = DatosPersonales(
            "Nombre $nuevaCantidadIntegrantes",
            "Apellido Paterno $nuevaCantidadIntegrantes",
            "Apellido Materno $nuevaCantidadIntegrantes",
            "Sexo $nuevaCantidadIntegrantes",
            "Fecha Nacimiento $nuevaCantidadIntegrantes"
        )

        integrantes.add(datosPersonales)

        cantidadIntegrantes.value = nuevaCantidadIntegrantes
    }

    fun getCantidadIntegrantes(): LiveData<Int> = cantidadIntegrantes

    fun getIntegrantes(): ArrayList<DatosPersonales> = integrantes

    fun quitarIntegrante() {

        if (integrantes.size <= 1)
            return

        integrantes.removeAt(integrantes.size - 1)

        cantidadIntegrantes.value = integrantes.size
    }
}

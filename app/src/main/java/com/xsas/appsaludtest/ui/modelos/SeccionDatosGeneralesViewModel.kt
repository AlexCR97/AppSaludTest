package com.xsas.appsaludtest.ui.modelos

import androidx.lifecycle.ViewModel
import com.xsas.appsaludtest.datos.vistas.DatosGenerales1
import com.xsas.appsaludtest.datos.vistas.DatosGenerales2
import com.xsas.appsaludtest.ui.EncuestaSingleton

class SeccionDatosGeneralesViewModel : ViewModel() {

    private val datosGenerales1 = arrayListOf<DatosGenerales1>()

    private val datosGenerales2 = arrayListOf<DatosGenerales2>()

    fun agregarDatosGenerales1(datosGenerales1: DatosGenerales1) {
        datosGenerales1.idEncuesta = EncuestaSingleton.idEncuesta
        datosGenerales1.fechaEncuesta = EncuestaSingleton.fechaEncuesta

        this.datosGenerales1.add(datosGenerales1)
    }

    fun agregarDatosGenerales2(datosGenerales2: DatosGenerales2) {
        datosGenerales2.idEncuesta = EncuestaSingleton.idEncuesta
        datosGenerales2.fechaEncuesta = EncuestaSingleton.fechaEncuesta

        this.datosGenerales2.add(datosGenerales2)
    }

    fun quitarDatosGenerales1() {
        datosGenerales1.removeAt(datosGenerales1.size - 1)
    }

    fun quitarDatosGenerales2() {
        datosGenerales2.removeAt(datosGenerales1.size - 1)
    }

    fun getDatosGenerales1(): ArrayList<DatosGenerales1> {
        return datosGenerales1
    }

    fun getDatosGenerales2(): ArrayList<DatosGenerales2> {
        return datosGenerales2
    }
}

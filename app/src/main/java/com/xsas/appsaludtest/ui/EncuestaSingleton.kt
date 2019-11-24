package com.xsas.appsaludtest.ui

import com.xsas.appsaludtest.datos.vistas.DatosGenerales1
import com.xsas.appsaludtest.datos.vistas.DatosGenerales2

object EncuestaSingleton {

    var idEncuesta: Long = -1
    var fechaEncuesta: String = ""
    var cantidadIntegrantes: Int = 1
    var datosGenerales1: List<DatosGenerales1> = ArrayList()
    var datosGenerales2: List<DatosGenerales2> = ArrayList()
    var cantidadEsquemasVacunacionNinos: Int = 0
    var cantidadEsquemasVacunacionAdolescentes: Int = 0
    var cantidadEsquemasVacunacionAdultosHombres: Int = 0
    var cantidadEsquemasVacunacionAdultosMujeres: Int = 0
    var cantidadEsquemasVacunacionAdultosMayores: Int = 0

}

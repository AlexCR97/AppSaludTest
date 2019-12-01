package com.xsas.appsaludtest.ui

import com.xsas.appsaludtest.datos.otros.IntegranteEsquema
import com.xsas.appsaludtest.datos.vistas.*

object EncuestaSingleton {

    var idEncuesta: Long = -1
    var fechaEncuesta: String = ""

    var cantidadIntegrantes: Int = 1

    var datosGenerales1 = ArrayList<DatosGenerales1>()
    var datosGenerales2 = ArrayList<DatosGenerales2>()

    var esquemas = ArrayList<EsquemaVacunacion>()
    var integrantesEsquemas = ArrayList<IntegranteEsquema>()

    var esquemasVacunacionNino1 = arrayListOf<EsquemaVacunacionNino1>()
    var esquemasVacunacionNino2 = arrayListOf<EsquemaVacunacionNino2>()
    var esquemasVacunacionNino3 = arrayListOf<EsquemaVacunacionNino3>()
    var esquemasVacunacionNino4 = arrayListOf<EsquemaVacunacionNino4>()
    var esquemasVacunacionNino5 = arrayListOf<EsquemaVacunacionNino5>()

    override fun toString(): String {
        val sb = StringBuilder()

        sb.append("${this.javaClass.simpleName}\n")
        sb.append("idEncuesta: $idEncuesta\n")
        sb.append("fechaEncuesta: $fechaEncuesta\n")
        sb.append("cantidadIntegrantes: $cantidadIntegrantes\n")
        sb.append("datosGenerales1: $datosGenerales1\n")
        sb.append("datosGenerales2: $datosGenerales2\n")
        sb.append("esquemas: $esquemas\n")
        sb.append("integrantesEsquemas: $integrantesEsquemas\n")

        return sb.toString()
    }
}

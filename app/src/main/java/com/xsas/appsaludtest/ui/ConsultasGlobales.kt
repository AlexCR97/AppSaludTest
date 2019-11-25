package com.xsas.appsaludtest.ui

object ConsultasGlobales {

    // sexo

    private var listaSexos: ArrayList<String>? = null

    var sexos: ArrayList<String>? = null
    get() {
        if (listaSexos == null) {
            listaSexos = arrayListOf(
                "Hombre",
                "Mujer"
            )
        }
        return listaSexos
    }

    // municipios

    private var listaMunicipios: ArrayList<String>? = null

    var municipios: ArrayList<String>? = null
    get() {
        if (listaMunicipios == null) {
            //TODO Ejecutar servicio web para listar municipios
            listaMunicipios = arrayListOf()
        }
        return listaMunicipios
    }

    fun actualizarMunicipios() {
        // TODO Ejecutar servicio web para listar municipios
        val municipiosTemp = arrayListOf<String>()

        if (municipiosTemp != null) {
            listaMunicipios?.clear()
            listaMunicipios?.addAll(municipiosTemp)
        }
    }

    // enfermedades

    private var listaEnfermedades: ArrayList<String>? = null

    var enfermedades: ArrayList<String>? = null
    get() {
        if (listaEnfermedades == null) {
            listaEnfermedades = arrayListOf(
                "Enfermedad 1",
                "Enfermedad 2",
                "Enfermedad 3",
                "Enfermedad 4",
                "Enfermedad 5",
                "Enfermedad 6",
                "Enfermedad 7",
                "Enfermedad 8",
                "Enfermedad 9",
                "Enfermedad 10"
            )
        }
        return listaEnfermedades
    }

    // adicciones

    private var listaAdicciones: ArrayList<String>? = null

    var adicciones: ArrayList<String>? = null
    get() {
        if (listaAdicciones == null) {
            listaAdicciones = arrayListOf(
                "Alcoholismo",
                "Drogadicción",
                "Tabaquismo"
            )
        }
        return listaAdicciones
    }

    // discapacidades

    private var listaDiscapacidades: ArrayList<String>? = null

    var discapacidades: ArrayList<String>? = null
    get() {
        if (listaDiscapacidades == null) {
            listaDiscapacidades = arrayListOf(
                "Visual",
                "Auditiva",
                "Motriz",
                "Lenguaje",
                "Sensorial"
            )
        }
        return listaDiscapacidades
    }

    // infecciones

    private var listaInfecciones: ArrayList<String>? = null

    var infecciones: ArrayList<String>? = null
    get() {
        if (listaInfecciones == null) {
            listaInfecciones = arrayListOf(
                "Infeccion 1",
                "Infeccion 2",
                "Infeccion 3",
                "Infeccion 4",
                "Infeccion 5"
            )
        }
        return listaInfecciones
    }
}

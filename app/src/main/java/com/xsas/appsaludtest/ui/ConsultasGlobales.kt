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

    // adicciones
}

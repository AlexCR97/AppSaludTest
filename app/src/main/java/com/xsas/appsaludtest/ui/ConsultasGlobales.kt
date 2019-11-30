package com.xsas.appsaludtest.ui

object ConsultasGlobales {

    // sexo

    private var listaSexos = arrayListOf<String>()

    val sexos: ArrayList<String>
        get() {
        if (listaSexos.isEmpty()) {
            listaSexos = arrayListOf(
                "Hombre",
                "Mujer"
            )
        }
        return listaSexos
    }

    // nacionalidades

    private var listaNacionalidades = arrayListOf<String>()

    val nacionalidades: ArrayList<String>
    get() {
        if (listaNacionalidades.isEmpty()) {
            listaNacionalidades = arrayListOf(
                "Tamaulipas"
            )
        }
        return listaNacionalidades
    }

    // jurisdicciones

    private var listaJurisdicciones: ArrayList<String>? = null

    val jurisdicciones: ArrayList<String>?
        get() {
        if (listaJurisdicciones == null) {
            listaJurisdicciones = arrayListOf(
                "Jurisdiccion 1",
                "Jurisdiccion 2",
                "Jurisdiccion 3",
                "Jurisdiccion 4",
                "Jurisdiccion 5"
            )
        }
        return listaJurisdicciones
    }

    // municipios

    private var listaMunicipios: ArrayList<String>? = null

    var municipios: ArrayList<String>? = null
    get() {
        if (listaMunicipios == null) {
            listaMunicipios = arrayListOf(
                "Municipio 1",
                "Municipio 2",
                "Municipio 3",
                "Municipio 4",
                "Municipio 5"
            )
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

    // centros de salud

    private var listaCentrosSalud: ArrayList<String>? = null

    var centrosSalud: ArrayList<String>? = null
    get() {
        if (listaCentrosSalud == null) {
            listaCentrosSalud = arrayListOf(
                "Centro de salud 1",
                "Centro de salud 2",
                "Centro de salud 3",
                "Centro de salud 4",
                "Centro de salud 5"
            )
        }
        return listaCentrosSalud
    }

    // servicios medicos

    private var listaServiciosMedicos = arrayListOf<String>()

    val serviciosMedicos: ArrayList<String>
    get() {
        if (listaServiciosMedicos.isEmpty()) {
            for (i in 1 until 11) {
                listaServiciosMedicos.add("Servicio Medico $i")
            }
        }
        return listaServiciosMedicos
    }

    // estados civiles

    private var listaEstadosCiviles = arrayListOf<String>()

    val estadosCiviles: ArrayList<String>
    get() {
        if (listaEstadosCiviles.isEmpty()) {
            listaEstadosCiviles = arrayListOf(
                "Casado/a",
                "Divorciad/a",
                "Soltero/a",
                "Viudo/a"
            )
        }
        return listaEstadosCiviles
    }

    // grados de estudio

    private var listaGradosEstudio = arrayListOf<String>()

    val gradosEstudio: ArrayList<String>
    get() {
        if (listaGradosEstudio.isEmpty()) {
            listaGradosEstudio = arrayListOf(
                "Pre-escolar",
                "Primaria",
                "Secundaria",
                "Bachillerato",
                "Licenciatura",
                "Maestría",
                "Doctorado"
            )
        }
        return listaGradosEstudio
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


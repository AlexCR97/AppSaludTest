package com.xsas.appsaludtest.ui

// TODO Agregar metodos para actualizar listas
// TODO Implementar servicios web de catalogos

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

    // entidades federativas
    private var listaEntidadesFederativas = linkedMapOf<String, String>()

    val entidadesFederativas: LinkedHashMap<String, String>
    get() {
        if (listaEntidadesFederativas.isEmpty()) {
            listaEntidadesFederativas = linkedMapOf(
                "Aguascalientes" to "AS",
                "Baja California" to "BC",
                "Baja California Sur" to "BS",
                "Campeche" to "CC",
                "Chiapas" to "CS",
                "Chihuahua" to "CH",
                "Coahuila" to "CL",
                "Colima" to "CM",
                "Distrito Federal" to "DF",
                "Durango" to "DG",
                "Guanajuato" to "GT",
                "Guerrero" to "GR",
                "Hidalgo" to "HG",
                "Jalisco" to "JC",
                "México" to "MC",
                "Michoacan" to "MN",
                "Morelos" to "MS",
                "Nayarit" to "NT",
                "Nuevo León" to "NL",
                "Oaxaca" to "OC",
                "Puebla" to "PL",
                "Querétaro" to "QT",
                "Quintana Roo" to "QR",
                "San Luis Potosí" to "SP",
                "Sinaloa" to "SL",
                "Sonora" to "SR",
                "Tabasco" to "TC",
                "Tlaxcala" to "TL",
                "Tamaulipas" to "TS",
                "Veracruz" to "VZ",
                "Yucatán" to "YN",
                "Zacatecas" to "ZS"
            )
        }
        return listaEntidadesFederativas
    }

    // jurisdicciones

    private var listaJurisdicciones = arrayListOf<String>()

    val jurisdicciones: ArrayList<String>
        get() {
        if (listaJurisdicciones.isEmpty()) {
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

    private var listaMunicipios = arrayListOf<String>()

    val municipios: ArrayList<String>
    get() {
        if (listaMunicipios.isEmpty()) {
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
        val municipiosTemp = arrayListOf<String>()

        if (municipiosTemp.isEmpty()) {
            listaMunicipios.clear()
            listaMunicipios.addAll(municipiosTemp)
        }
    }

    // centros de salud

    private var listaCentrosSalud = arrayListOf<String>()

    val centrosSalud: ArrayList<String>
    get() {
        if (listaCentrosSalud.isEmpty()) {
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

    private var listaEnfermedades = arrayListOf<String>()

    val enfermedades: ArrayList<String>
    get() {
        if (listaEnfermedades.isEmpty()) {
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

    private var listaAdicciones = arrayListOf<String>()

    val adicciones: ArrayList<String>
    get() {
        if (listaAdicciones.isEmpty()) {
            listaAdicciones = arrayListOf(
                "Alcoholismo",
                "Drogadicción",
                "Tabaquismo"
            )
        }
        return listaAdicciones
    }

    // discapacidades

    private var listaDiscapacidades = arrayListOf<String>()

    val discapacidades: ArrayList<String>
    get() {
        if (listaDiscapacidades.isEmpty()) {
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

    private var listaInfecciones = arrayListOf<String>()

    val infecciones: ArrayList<String>
    get() {
        if (listaInfecciones.isEmpty()) {
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

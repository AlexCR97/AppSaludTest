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

    private var mapaJurisdicciones = linkedMapOf<String, LinkedHashMap<String, ArrayList<String>>>()

    val jurisdicciones: LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>>
    get() {
        if (mapaJurisdicciones.isEmpty()) {
            mapaJurisdicciones = linkedMapOf(
                "Tamaulipas" to municipios
            )
        }
        return mapaJurisdicciones
    }

    // municipios con centros de salud

    private var mapaMunicipios = linkedMapOf<String, ArrayList<String>>()

    val municipios: LinkedHashMap<String, ArrayList<String>>
        get() {
            if (mapaMunicipios.isEmpty()) {
                mapaMunicipios = linkedMapOf(
                    "Mante" to arrayListOf(
                        "Brisas Mod. 1",
                        "Brisas Mod. 2",
                        "Brisas Mod. 3",
                        "Brisas Mod. 4",
                        "Brisas Mod. 5",
                        "Brisas Mod. 6",
                        "CSU. Aquíles Serdán",
                        "CSU. Fomento Nacional",
                        "Col. E. Cárdenas González",
                        "Col. Río Mante",
                        "Col. Progreso Social",
                        "C.S. Cuahutemoc",
                        "CSR. El Abra",
                        "CSR. Ej. Celaya",
                        "CSR. Ej. Lazaro Cárdenas",
                        "CSR. Ej. Camotero No. 2",
                        "CSR. Ej. Los Aztecas",
                        "CSR. Tantoyuquita",
                        "CSR. San M. de la Mora",
                        "CSR. Pob. El Limón",
                        "U.M. González-Mante",
                        "U.M. #16",
                        "U.M. #17",
                        "U.M. #26"
                    ),
                    "Antiguo Morelos" to arrayListOf(
                        "CS. Antiguo Morelos",
                        "UMM. 1 Tamaulipas 17"
                    ),
                    "Nuevo Morelos" to arrayListOf(
                        "C.S. Nuevo Morelos",
                        "UMM. 1 Tamaulipas 17",
                        "Santa Cruz del Toro"
                    ),
                    "Ocampo" to arrayListOf(
                        "C.S. Ocampo",
                        "UMM. 1 Tamaulipas 16",
                        "UMM. 1 Tamaulipas 17",
                        "C.S. Pencil"
                    ),
                    "Gomez Farías" to arrayListOf(
                        "C.S. Gomez Farias",
                        "UMM. Tamaulipas 26",
                        "UMM. 1 Tamaulipas 17",
                        "UM. Caravanas de la Salud Mante 16",
                        "CS. Loma Alta",
                        "San José"
                    ),
                    "Xicotencatl" to arrayListOf(
                        "CS. Xicotencatl",
                        "UM. Oportunidades",
                        "Trancas y Sauzal"
                    )
                )
            }
            return mapaMunicipios
        }

    // localidades

    private var mapaLocalidades = linkedMapOf<String, ArrayList<String>>()

    val localidades: LinkedHashMap<String, ArrayList<String>>
    get() {
        if (mapaLocalidades.isEmpty()) {
            mapaLocalidades = linkedMapOf(
                "Mante" to arrayListOf(
                    "Zona Centro Norte",
                    "Zona Centro Sur",
                    "Col. Las Brisas",
                    "Col. Altavista",
                    "Col. Ladrillera",
                    "Col. P. Elias Calles",
                    "Col. Independencia",
                    "Col. Campesina",
                    "Col. Obrera #2",
                    "Col. Secc. Agronomica",
                    "Col. Paraiso",
                    "Col. Amplicacion Campesina",
                    "Col. Carolina Yucatan 2",
                    "Col. Union y Progreso",
                    "Col. Tomas Yarrington",
                    "Col. Club de Leones",
                    "Col. Union Burocratica Sector 5",
                    "Col. Ampliacion Campesina",
                    "Col. Plutarco Elias Calles",
                    "Fraccionamiento Quintero",
                    "Campo Experimental",
                    "Ej. Nuevo Quintero",
                    "Ej. Camotero 1",
                    "Col. Rosalinda Cavazos Lerma",
                    "Col. Union Burocratica 1, 2, 3, y 4",
                    "Col. Nicolas Bravo",
                    "Col. Carolina Yucatan",
                    "Ej. Mante",
                    "Col. Municipio Libre",
                    "Col. Las Americas",
                    "Col. M. del Pino",
                    "Col. Esfuerzo Obrero",
                    "Col. Aquiles Serdan",
                    "Col. Lopez Portillo",
                    "Col. Plan de Ayutla",
                    "Col. 20 de Noviembre",
                    "Col. Miravalle",
                    "Col. Del Valle",
                    "Col. Moctezuma",
                    "Col. San Francisco",
                    "Col. Ampl. 20 de septiembre",
                    "Col. Ayuntamiento",
                    "Fracc. Las Palmas",
                    "Col. Fomento Nacional",
                    "Col. Canoas",
                    "Col. El Martillo",
                    "Col. Miguel Aleman Ote.",
                    "Fracc. Los Angeles",
                    "Fracc. Faja de Oro",
                    "Santa Monica",
                    "Col. Ayuntamiento",
                    "Cerro del Bernal",
                    "Col. Vicente Guerrero"
                ),
                "Antiguo Morelos" to arrayListOf(
                    "Barrio la Mision",
                    "El Callejo",
                    "Ej. El Porvenir",
                    "Barrio la Bolsa",
                    "Unidad Deportiva",
                    "Voluntad y Trabajo",
                    "Barrio el Tamarino"
                ),
                "Nuevo Morelos" to arrayListOf(
                    "Nvo. Morelos Z.C.",
                    "El Pescadito",
                    "Col. del Sol",
                    "Fracc. Vivamos Mejor",
                    "Col. Paraiso",
                    "Ej. Amp. Nvo. Morelos",
                    "Ej. Amp. La Reforma",
                    "San Diego-Jordan",
                    "Ej. Francisco Villa",
                    "Ej. La Reforma",
                    "Santa Cruz del Toro"
                ),
                "Ocampo" to arrayListOf(
                    "Colonia 1",
                    "Colonia 2",
                    "Colonia 3",
                    "Colonia 4",
                    "Colonia 5",
                    "Colonia 6",
                    "Colonia 7",
                    "Colonia 8",
                    "Colonia 9",
                    "Colonia 10"
                ),
                "Gomez Farías" to arrayListOf(
                    "Colonia 1",
                    "Colonia 2",
                    "Colonia 3",
                    "Colonia 4",
                    "Colonia 5",
                    "Colonia 6",
                    "Colonia 7",
                    "Colonia 8",
                    "Colonia 9",
                    "Colonia 10"
                ),
                "Xicotencatl" to arrayListOf(
                    "Colonia 1",
                    "Colonia 2",
                    "Colonia 3",
                    "Colonia 4",
                    "Colonia 5",
                    "Colonia 6",
                    "Colonia 7",
                    "Colonia 8",
                    "Colonia 9",
                    "Colonia 10"
                )
            )
        }
        return mapaLocalidades
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

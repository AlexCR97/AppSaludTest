package com.xsas.appsaludtest.datos.vistas

data class DatosGenerales2(
    var edad: Int = -1,
    var servicioMedico: String = "",
    var ocupacion: String = "",
    var estadoCivil: String = "",
    var nacionalidad: String = "",
    var residenciaAnterior: String = "",
    var ultimoGradoEstudio: String = ""
) : VistaEncuesta()
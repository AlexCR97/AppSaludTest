package com.xsas.appsaludtest.datos.vistas

data class DatosPersonales(
    var nombres: String = "",
    var apellidoPaterno: String = "",
    var apellidoMaterno: String = "",
    var sexo: String = "",
    var fechaNacimiento: String = ""
) : VistaEncuesta()
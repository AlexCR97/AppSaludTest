package com.xsas.appsaludtest.datos.vistas

data class DatosGenerales1(
    var apellidoPaterno: String = "",
    var apellidoMaterno: String = "",
    var nombres: String = "",
    var sexo: String = "",
    var nacionalidad: String = "",
    var fechaNacimiento: String = "",
    var curp: String = ""
) : VistaEncuesta() {

    val nombreCompleto: String
    get() = "$nombres $apellidoPaterno $apellidoMaterno"

}

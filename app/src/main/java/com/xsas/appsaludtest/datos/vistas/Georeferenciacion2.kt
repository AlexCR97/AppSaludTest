package com.xsas.appsaludtest.datos.vistas

data class Georeferenciacion2(
    var codigoPostal: String = "",
    var localidad: String = "",
    var calle: String = "",
    var numeroExterior: String = "",
    var numeroInterior: String = ""
) {
    override fun toString(): String {
        return "Georeferenciacion2(codigoPostal='$codigoPostal', localidad='$localidad', calle='$calle', numeroExterior='$numeroExterior', numeroInterior='$numeroInterior')"
    }
}

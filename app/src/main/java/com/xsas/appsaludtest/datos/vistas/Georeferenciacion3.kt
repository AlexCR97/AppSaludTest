package com.xsas.appsaludtest.datos.vistas

data class Georeferenciacion3(
    var telefono: String = "",
    var referenciaUbicacion: String = ""
) {
    override fun toString(): String {
        return "Georeferenciacion3(telefono='$telefono', referenciaUbicacion='$referenciaUbicacion')"
    }
}

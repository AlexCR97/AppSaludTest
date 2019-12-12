package com.xsas.appsaludtest.datos.vistas

data class Georeferenciacion1(
    var jurisdiccion: String = "",
    var municipio: String = "",
    var centroSalud: String = ""
) {
    override fun toString(): String {
        return "Georeferenciacion1(jurisdiccion='$jurisdiccion', municipio='$municipio', centroSalud='$centroSalud')"
    }
}

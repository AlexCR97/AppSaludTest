package com.xsas.appsaludtest.datos.otros

data class IntegranteEsquema(
    var index: Int = -1,
    var nombres: String = "",
    var apellidoPaterno: String = "",
    var apellidoMaterno: String = "",
    var edad: Int = -1,
    var sexo: String = "",
    var tipoCartilla: TipoCartilla = TipoCartilla.NINO
)
package com.xsas.appsaludtest.datos.vistas

data class EsquemaVacunacionAnciano2(
    var tdEsquemaCompletoFechaRefuerzo: String = "",
    var tdEsquemaIncompletoFechaPrimera: String = "",
    var tdEsquemaIncompletoFechaSegunda: String = "",
    var tdEsquemaIncompletoFechaTercera: String = ""
) : VistaEncuesta()
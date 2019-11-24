package com.xsas.appsaludtest.datos.vistas

data class EsquemaVacunacionAdultoMujer1(
    var srEsquemaIncompletoFechaPrimera: String = "",
    var srEsquemaIncompletoFechaSegunda: String = "",
    var srEsquemaIncompletoFechaUnica: String = ""
) : VistaEncuesta()
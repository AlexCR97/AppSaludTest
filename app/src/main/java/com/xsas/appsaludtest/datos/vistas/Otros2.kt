package com.xsas.appsaludtest.datos.vistas

data class Otros2(
    var tabaquismo: Boolean = false,
    var alcoholismo: Boolean = false,
    var drogadiccion: Boolean = false,
    var visual: Boolean = false,
    var auditiva: Boolean = false,
    var motriz: Boolean = false,
    var lenguaje: Boolean = false,
    var sensorial: Boolean = false
) : VistaEncuesta()
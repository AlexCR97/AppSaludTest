package com.xsas.appsaludtest.datos.vistas

import androidx.room.Entity

@Entity(tableName = "otros_2")
data class Otros2(
    var tabaquismo: Boolean = false,
    var alcoholismo: Boolean = false,
    var drogadiccion: Boolean = false,
    var visual: Boolean = false,
    var auditiva: Boolean = false,
    var motriz: Boolean = false,
    var lenguaje: Boolean = false,
    var sensorial: Boolean = false
)


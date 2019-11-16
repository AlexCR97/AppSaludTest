package com.xsas.appsaludtest.datos.vistas

import androidx.room.Entity

@Entity(tableName = "otros_1")
open class Otros1(
    var peso: Float = 0f,
    var altura: Float = 0f,
    var estadoNutricional: String = "",
    var trastornos: String = "",
    var tipoVista: Int = 1
)
package com.xsas.appsaludtest.datos.vistas

import androidx.room.Entity

@Entity(tableName = "otros_adulto_1")
data class Otros1Adulto(
    var abandonado: Boolean = false
) : Otros1()

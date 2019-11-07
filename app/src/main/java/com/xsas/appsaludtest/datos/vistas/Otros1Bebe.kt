package com.xsas.appsaludtest.datos.vistas

import androidx.room.Entity

@Entity(tableName = "otros_1_Bebe")
data class Otros1Bebe(
    var tamizNeonatal: Boolean = false,
    var tamizAuditivo: Boolean = false
) : Otros1()

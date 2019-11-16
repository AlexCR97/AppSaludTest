package com.xsas.appsaludtest.datos.vistas

import androidx.room.Entity

@Entity(tableName = "otros_bebe_1")

data class Otros1Bebe(
    var tamizNeonatal: Boolean = false,
    var tamizAuditivo: Boolean = false
) : Otros1()

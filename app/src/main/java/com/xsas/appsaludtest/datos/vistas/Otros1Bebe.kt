package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.BINARY
import androidx.room.Entity

@Entity(tableName = "Otros1Bebe")
data class Otros1Bebe(
    @NonNull
    @ColumnInfo(name = "tamizNeonatal", typeAffinity = BINARY)
    var tamizNeonatal: Boolean = false,

    @NonNull
    @ColumnInfo(name = "tamizAuditivo", typeAffinity = BINARY)
    var tamizAuditivo: Boolean = false
) : Otros1()

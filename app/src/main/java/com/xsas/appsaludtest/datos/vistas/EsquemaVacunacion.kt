package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.BINARY
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacion")
data class EsquemaVacunacion(
    @NonNull
    @ColumnInfo(name = "tieneCartilla", typeAffinity = BINARY)
    var tieneCartilla: Boolean = false
) : VistaEncuesta()
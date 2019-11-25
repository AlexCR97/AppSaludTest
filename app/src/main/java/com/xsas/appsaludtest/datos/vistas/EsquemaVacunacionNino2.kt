package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionNino2")
data class EsquemaVacunacionNino2(
    @NonNull
    @ColumnInfo(name = "hepatitisBFechaPrimera", typeAffinity = TEXT)
    var hepatitisBFechaPrimera: String = "",

    @NonNull
    @ColumnInfo(name = "hepatitisBFechaSegunda", typeAffinity = TEXT)
    var hepatitisBFechaSegunda: String = "",

    @NonNull
    @ColumnInfo(name = "hepatitisBFechaSegunda", typeAffinity = TEXT)
    var hepatitisBFechaTercera: String = ""
)

package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionAdolescente6")
data class EsquemaVacunacionAdolescente6(
    @NonNull
    @ColumnInfo(name = "vphFechaPrimera", typeAffinity = TEXT)
    var vphFechaPrimera: String = "",

    @NonNull
    @ColumnInfo(name = "vphFechaSegunda", typeAffinity = TEXT)
    var vphFechaSegunda: String = "",

    @NonNull
    @ColumnInfo(name = "vphFechaTercera", typeAffinity = TEXT)
    var vphFechaTercera: String = ""
)

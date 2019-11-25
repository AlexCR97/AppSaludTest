package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionAnciano1")
data class EsquemaVacunacionAnciano1(
    @NonNull
    @ColumnInfo(name = "nuemococicaFechaUnica", typeAffinity = TEXT)
    var nuemococicaFechaUnica: String = ""
)

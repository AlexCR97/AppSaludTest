package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionAdultoMujer2")
data class EsquemaVacunacionAdultoMujer2(
    @NonNull
    @ColumnInfo(name = "tdEsquemaCompletoFechaRefuerzo", typeAffinity = TEXT)
    var tdEsquemaCompletoFechaRefuerzo: String = "",

    @NonNull
    @ColumnInfo(name = "tdEsquemaCompletoFechaPrimera", typeAffinity = TEXT)
    var tdEsquemaIncompletoFechaPrimera: String = "",

    @NonNull
    @ColumnInfo(name = "tdEsquemaCompletoFechaSegunda", typeAffinity = TEXT)
    var tdEsquemaIncompletoFechaSegunda: String = "",

    @NonNull
    @ColumnInfo(name = "tdEsquemaCompletoFechaTercera", typeAffinity = TEXT)
    var tdEsquemaIncompletoFechaTercera: String = ""
)

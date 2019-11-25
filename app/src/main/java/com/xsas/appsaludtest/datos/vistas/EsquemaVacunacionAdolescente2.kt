package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionAdolescente2")
data class EsquemaVacunacionAdolescente2(
    @NonNull
    @ColumnInfo(name = "tdEsquemaCompletoFechaRefuerzo", typeAffinity = TEXT)
    var tdEsquemaCompletoFechaRefuerzo: String = "",

    @NonNull
    @ColumnInfo(name = "tdEsquemaIncompletoFechaPrimera", typeAffinity = TEXT)
    var tdEsquemaIncompletoFechaPrimera: String = "",

    @NonNull
    @ColumnInfo(name = "tdEsquemaIncompletoFechaSegunda", typeAffinity = TEXT)
    var tdEsquemaIncompletoFechaSegunda: String = "",

    @NonNull
    @ColumnInfo(name = "tdEsquemaIncompletoFechaTercera", typeAffinity = TEXT)
    var tdEsquemaIncompletoFechaTercera: String = ""
) : VistaEncuesta()
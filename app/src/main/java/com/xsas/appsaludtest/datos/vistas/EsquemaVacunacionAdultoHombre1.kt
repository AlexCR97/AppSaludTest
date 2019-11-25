package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionAdultoHombre1")
data class EsquemaVacunacionAdultoHombre1(
    @NonNull
    @ColumnInfo(name = "srSinAntescedenteFechaPrimera", typeAffinity = TEXT)
    var srSinAntescedenteFechaPrimera: String = "",

    @NonNull
    @ColumnInfo(name = "srSinAntescedenteFechaSegunda", typeAffinity = TEXT)
    var srSinAntescedenteFechaSegunda: String = "",

    @NonNull
    @ColumnInfo(name = "srEsquemaIncompletoFechaPrimera", typeAffinity = TEXT)
    var srEsquemaIncompletoFechaPrimera: String = ""
) : VistaEncuesta()
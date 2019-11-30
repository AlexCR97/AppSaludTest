package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionAdultoMujer1")
data class EsquemaVacunacionAdultoMujer1(
    @NonNull
    @ColumnInfo(name = "srEsquemaIncompletoFechaPrimera", typeAffinity = TEXT)
    var srEsquemaIncompletoFechaPrimera: String = "",

    @NonNull
    @ColumnInfo(name = "srEsquemaIncompletoFechaSegunda", typeAffinity = TEXT)
    var srEsquemaIncompletoFechaSegunda: String = "",

    @NonNull
    @ColumnInfo(name = "srEsquemaIncompletoFechaUnica", typeAffinity = TEXT)
    var srEsquemaIncompletoFechaUnica: String = ""
) : VistaEncuesta()
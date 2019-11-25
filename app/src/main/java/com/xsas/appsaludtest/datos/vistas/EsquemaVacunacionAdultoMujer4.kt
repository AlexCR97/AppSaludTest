package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionAdultoMujer4")
data class EsquemaVacunacionAdultoMujer4(
    @NonNull
    @ColumnInfo(name = "influenzaEstacionalFecha", typeAffinity = TEXT)
    var influenzaEstacionalFecha: String = ""
) : VistaEncuesta()
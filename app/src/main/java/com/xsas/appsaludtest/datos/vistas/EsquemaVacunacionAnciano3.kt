package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionAnciano3")
data class EsquemaVacunacionAnciano3(
    @NonNull
    @ColumnInfo(name = "influenzaEstacionalFecha", typeAffinity = TEXT)
    var influenzaEstacionalFecha: String = ""
) : VistaEncuesta()
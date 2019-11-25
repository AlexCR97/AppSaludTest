package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionAdolescente4")
data class EsquemaVacunacionAdolescente4(
    @NonNull
    @ColumnInfo(name = "influenzaEstacionalFechaUnica", typeAffinity = TEXT)
    var influenzaEstacionalFechaUnica: String = ""
) : VistaEncuesta()
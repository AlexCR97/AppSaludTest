package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionAdolescente3")
data class EsquemaVacunacionAdolescente3(
    @NonNull
    @ColumnInfo(name = "tdpaFechaUnica", typeAffinity = TEXT)
    var tdpaFechaUnica: String = ""
) : VistaEncuesta()
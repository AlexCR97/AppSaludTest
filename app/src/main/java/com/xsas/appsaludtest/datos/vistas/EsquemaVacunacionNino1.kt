package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionNino1")
data class EsquemaVacunacionNino1(
    @NonNull
    @ColumnInfo(name = "bcgFechaUnica", typeAffinity = TEXT)
    var bcgFechaUnica: String = ""
) : VistaEncuesta()
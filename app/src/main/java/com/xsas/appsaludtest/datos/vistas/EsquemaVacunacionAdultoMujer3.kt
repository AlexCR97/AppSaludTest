package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionAdultoMujer3")
data class EsquemaVacunacionAdultoMujer3(
    @NonNull
    @ColumnInfo(name = "tdpaEsquemaCompletoFechaUnica", typeAffinity = TEXT)
    var tdpaEsquemaCompletoFechaUnica: String = ""
)

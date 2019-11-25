package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionAdultoHombre3")
data class EsquemaVacunacionAdultoHombre3(
    @NonNull
    @ColumnInfo(name = "influenzaEstacionalFecha", typeAffinity = TEXT)
    var influenzaEstacionalFecha: String = ""
)

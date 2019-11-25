package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionNino4")
data class EsquemaVacunacionNino4(
    @NonNull
    @ColumnInfo(name = "dtpFechaRefuerzo", typeAffinity = TEXT)
    var dtpFechaRefuerzo: String = "",

    @NonNull
    @ColumnInfo(name = "rotaVirusFechaPrimera", typeAffinity = TEXT)
    var rotaVirusFechaPrimera: String = "",

    @NonNull
    @ColumnInfo(name = "rotaVirusFechaSegunda", typeAffinity = TEXT)
    var rotaVirusFechaSegunda: String = "",

    @NonNull
    @ColumnInfo(name = "rotaVirusFechaTercera", typeAffinity = TEXT)
    var rotaVirusFechaTercera: String = ""
)


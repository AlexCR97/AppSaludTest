package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionAdolescente5")
data class EsquemaVacunacionAdolescente5(
    @NonNull
    @ColumnInfo(name = "srSinAntecescedenteVacunalFechaPrimera", typeAffinity = TEXT)
    var srSinAntescedenteVacunalFechaPrimera: String = "",

    @NonNull
    @ColumnInfo(name = "srSinAntecescedenteVacunalFechaSegunda", typeAffinity = TEXT)
    var srSinAntescedenteVacunalFechaSegunda: String = "",

    @NonNull
    @ColumnInfo(name = "srFechaUnica", typeAffinity = TEXT)
    var srFechaUnica: String = ""
) : VistaEncuesta()
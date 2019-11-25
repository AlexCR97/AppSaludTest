package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "EsquemaVacunacionNino3")
data class EsquemaVacunacionNino3(
    @NonNull
    @ColumnInfo(name = "petavalenteACelularFechaPrimera", typeAffinity = TEXT)
    var petavalenteACelularFechaPrimera: String = "",

    @NonNull
    @ColumnInfo(name = "petavalenteACelularFechaSegunda", typeAffinity = TEXT)
    var petavalenteACelularFechaSegunda: String = "",

    @NonNull
    @ColumnInfo(name = "petavalenteACelularFechaTercera", typeAffinity = TEXT)
    var petavalenteACelularFechaTercera: String = "",

    @NonNull
    @ColumnInfo(name = "petavalenteACelularFechaCuarta", typeAffinity = TEXT)
    var petavalenteACelularFechaCuarta: String = ""
)

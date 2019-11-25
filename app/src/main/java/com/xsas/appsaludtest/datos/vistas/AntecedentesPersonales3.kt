package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "AntecedentesPersonales3")
data class AntecedentesPersonales3(
    @NonNull
    @ColumnInfo(name = "enfermedadesInfancia", typeAffinity = TEXT)
    var enfermedadesInfancia: String = "",

    @NonNull
    @ColumnInfo(name = "enfermedadesAdulto", typeAffinity = TEXT)
    var enfermedadesAdulto: String = "",

    @NonNull
    @ColumnInfo(name = "enfermedadesOtros", typeAffinity = TEXT)
    var enfermedadesOtros: String = ""
)
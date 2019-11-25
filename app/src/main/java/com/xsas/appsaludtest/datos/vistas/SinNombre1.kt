package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "SinNombre1")
data class SinNombre1(
    @NonNull
    @ColumnInfo(name = "enfermedadesEpidemiologicas", typeAffinity = TEXT)
    var enfermedadesEpidemiologicas: String = ""

)
package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.ColumnInfo.INTEGER
import androidx.room.Entity

@Entity(tableName = "AntecedentesPersonales4")
data class AntecedentesPersonales4(
    @NonNull
    @ColumnInfo(name = "fum", typeAffinity = TEXT)
    var fum: String = "",

    @NonNull
    @ColumnInfo(name = "fpp", typeAffinity = TEXT)
    var fpp: String = "",

    @NonNull
    @ColumnInfo(name = "fum", typeAffinity = INTEGER)
    var edadGestional: Int = 0,

    @NonNull
    @ColumnInfo(name = "menarca", typeAffinity = TEXT)
    var menarca: String = "",

    @NonNull
    @ColumnInfo(name = "ritmoMenstrual", typeAffinity = INTEGER)
    var ritmoMenstrual: Int = 0
)
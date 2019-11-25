package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.ColumnInfo.REAL
import androidx.room.Entity

@Entity(tableName = "Otros1")
open class Otros1(
    @NonNull
    @ColumnInfo(name = "peso", typeAffinity = REAL)
    var peso: Float = 0f,

    @NonNull
    @ColumnInfo(name = "altura", typeAffinity = REAL)
    var altura: Float = 0f,

    @NonNull
    @ColumnInfo(name = "estadoNutricional", typeAffinity = TEXT)
    var estadoNutricional: String = "",

    @NonNull
    @ColumnInfo(name = "trastornos", typeAffinity = TEXT)
    var trastornos: String = "",

    var tipoVista: Int = 1
) : VistaEncuesta()
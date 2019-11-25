package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "CaracteristicasVivienda1")
data class CaracteristicasVivienda1(
    @NonNull
    @ColumnInfo(name = "tipoVivienda", typeAffinity = TEXT)
    var tipoVivienda: String = "",

    @NonNull
    @ColumnInfo(name = "tipoMuro", typeAffinity = TEXT)
    var tipoMuro: String = "",

    @NonNull
    @ColumnInfo(name = "tipoTecho", typeAffinity = TEXT)
    var tipoTecho: String = "",

    @NonNull
    @ColumnInfo(name = "tipoPiso", typeAffinity = TEXT)
    var tipoPiso: String = "",

    @NonNull
    @ColumnInfo(name = "viviendaCuentaCon", typeAffinity = TEXT)
    var viviendaCuentaCon: String = ""
)
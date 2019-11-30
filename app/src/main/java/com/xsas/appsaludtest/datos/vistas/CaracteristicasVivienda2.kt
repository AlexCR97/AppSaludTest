package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.ColumnInfo.INTEGER
import androidx.room.Entity

@Entity(tableName = "CaracteristicasVivienda2")
data class CaracteristicasVivienda2(
    @NonNull
    @ColumnInfo(name = "tipoDrenaje", typeAffinity = TEXT)
    var tipoDrenaje: String ="",

    @NonNull
    @ColumnInfo(name = "origenLuz", typeAffinity = TEXT)
    var origenLuz:String = "",

    @NonNull
    @ColumnInfo(name = "cuentaConHuertoFamiliar", typeAffinity = TEXT)
    var cuentaConHuertoFamiliar: String = "",

    @NonNull
    @ColumnInfo(name = "numeroDeCuartos", typeAffinity = INTEGER)
    var numeroDeCuartos: Int = 0,

    @NonNull
    @ColumnInfo(name = "combustionParaCocinar", typeAffinity = TEXT)
    var combustionParaCocinar: String = ""
)
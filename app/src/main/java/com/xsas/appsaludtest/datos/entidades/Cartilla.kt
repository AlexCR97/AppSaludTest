package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "cartilla")
data class Cartilla(
    @NonNull
    @ColumnInfo(name="id_inmunizacion",typeAffinity = INTEGER)
    var idInmunizacion:Integer,

    @NonNull
    @ColumnInfo(name="id_vacuna_dosis_edad",typeAffinity = INTEGER)
    var idVacunaDosisEdad:Integer,

    @NonNull
    @ColumnInfo(name="fecha",typeAffinity = TEXT)
    var fecha:String


) {
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
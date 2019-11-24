package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vacuna_dosis_edad")
data class VacunaDosisEdad (
    @NonNull
    @ColumnInfo(name="id_vacuna_dosis_edad",typeAffinity = INTEGER)
    var idVacunaDosisEdad:Integer,

    @NonNull
    @ColumnInfo(name="id_dosis",typeAffinity = INTEGER)
    var idDosis:Integer,

    @NonNull
    @ColumnInfo(name="id_edad_frecuencia",typeAffinity = INTEGER)
    var idEdadFrecuencia:Integer,

    @NonNull
    @ColumnInfo(name="id_vacuna",typeAffinity = INTEGER)
    var idVacuna:Integer




    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0

}
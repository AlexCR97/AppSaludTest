package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "vivienda_mascota")
data class ViviendaMascota (
    @NonNull
    @ColumnInfo(name="id_vivienda",typeAffinity = ColumnInfo.INTEGER)
    var idVivienda:Integer,

    @NonNull
    @ColumnInfo(name="id_mascota",typeAffinity = ColumnInfo.INTEGER)
    var idMascota:Integer


    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}

//12  8 6 7 7 1  7 3 5 2 6
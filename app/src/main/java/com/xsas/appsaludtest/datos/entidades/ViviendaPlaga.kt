package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vivienda_plaga")
data class ViviendaPlaga (
    @NonNull
    @ColumnInfo(name="id_vivienda",typeAffinity = ColumnInfo.INTEGER)
    var idVivienda:Integer,

    @NonNull
    @ColumnInfo(name="id_plaga",typeAffinity = ColumnInfo.INTEGER)
    var idPlaga:Integer


    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
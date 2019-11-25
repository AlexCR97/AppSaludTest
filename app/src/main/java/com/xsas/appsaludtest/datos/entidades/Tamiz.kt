package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tamiz")
data class Tamiz (

    //es de tipo bit
    @NonNull
    @ColumnInfo(name="neonatal",typeAffinity = ColumnInfo.INTEGER)
    var neonatal:Integer,


    //es de tipo bit
    @NonNull
    @ColumnInfo(name="auditivo",typeAffinity = ColumnInfo.INTEGER)
    var auditivo:Integer,

    @NonNull
    @ColumnInfo(name="id_inmunizacion",typeAffinity = ColumnInfo.INTEGER)
    var idInmunizacion:Integer
    ){

    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
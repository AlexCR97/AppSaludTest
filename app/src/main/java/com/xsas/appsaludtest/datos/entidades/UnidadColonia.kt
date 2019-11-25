package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "unidad_colonia")
data class UnidadColonia (
    @NonNull
    @ColumnInfo(name="id_unidad",typeAffinity = ColumnInfo.INTEGER)
    var idUnidad:Integer,

    @NonNull
    @ColumnInfo(name="id_colonia",typeAffinity = ColumnInfo.INTEGER)
    var idColonia:Integer
    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
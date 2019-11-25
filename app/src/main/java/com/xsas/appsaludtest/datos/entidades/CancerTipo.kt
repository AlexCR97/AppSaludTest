package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "canceres_tipos")
data class CancerTipo (
    @NonNull
    @ColumnInfo(name="id_cancer",typeAffinity = ColumnInfo.INTEGER)
    var idCancer:Integer,

    @NonNull
    @ColumnInfo(name="deteccion",typeAffinity = ColumnInfo.TEXT)
    var deteccion:String,

    @NonNull
    @ColumnInfo(name="id_tipo_deteccion",typeAffinity = ColumnInfo.INTEGER)
    var idTipoDEteccion:Integer,


    //
    @NonNull
    @ColumnInfo(name="se_detecto",typeAffinity = ColumnInfo.INTEGER)
    var seDetecto:Integer
){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
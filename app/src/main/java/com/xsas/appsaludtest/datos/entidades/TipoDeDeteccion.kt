package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "tipos_de_deteccion")
data class TipoDeDeteccion (
    @NonNull
    @ColumnInfo(name="id_tipo_deteccion",typeAffinity = ColumnInfo.INTEGER)
    var idTipoDeteccion:Integer,

    @NonNull
    @ColumnInfo(name="tipos_de_canceres",typeAffinity = ColumnInfo.TEXT)
    var tiposDeCanceres:String


    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
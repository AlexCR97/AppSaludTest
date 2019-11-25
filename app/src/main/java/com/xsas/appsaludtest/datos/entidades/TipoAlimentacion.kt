package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tipos_alimentaciones")
data class TipoAlimentacion (
    @NonNull
    @ColumnInfo(name="id_tipos_alimentaciones",typeAffinity = ColumnInfo.INTEGER)
    var idTiposAlimentaciones:Integer,

    @NonNull
    @ColumnInfo(name="alimentacion",typeAffinity = ColumnInfo.TEXT)
    var alimentacion:String


    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
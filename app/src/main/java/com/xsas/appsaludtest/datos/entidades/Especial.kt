package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "especiales")
data class Especial (
    @NonNull
    @ColumnInfo(name="id_especial",typeAffinity = ColumnInfo.INTEGER)
    var idEspecial:Integer,

    @NonNull
    @ColumnInfo(name="especial",typeAffinity = ColumnInfo.TEXT)
    var especial:String


    ){
}
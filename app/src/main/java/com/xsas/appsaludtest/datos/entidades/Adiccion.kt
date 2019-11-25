package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "adicciones")
data class Adiccion (
    @NonNull
    @ColumnInfo(name="id_adiccion",typeAffinity = ColumnInfo.INTEGER)
    var idAdiccion:Integer,

    @NonNull
    @ColumnInfo(name="trimestre",typeAffinity = ColumnInfo.TEXT)
    var adiccion:String

    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
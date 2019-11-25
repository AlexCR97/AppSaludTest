package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "plagas")
data class Plaga (
    @NonNull
    @ColumnInfo(name="id_plaga",typeAffinity = ColumnInfo.INTEGER)
    var idPlaga:Integer,

    @NonNull
    @ColumnInfo(name="plaga",typeAffinity = ColumnInfo.TEXT)
    var plaga:String


    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
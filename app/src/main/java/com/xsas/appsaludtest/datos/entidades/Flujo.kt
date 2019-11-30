package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "flujos")
data class Flujo (
    @NonNull
    @ColumnInfo(name="id_flujos",typeAffinity = ColumnInfo.INTEGER)
    var idFlujos:Integer,

    @NonNull
    @ColumnInfo(name="flujo",typeAffinity = ColumnInfo.TEXT)
    var flujo:String
    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
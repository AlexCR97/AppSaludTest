package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "combustibles")
data class Combustible (
    @NonNull
    @ColumnInfo(name="id_combustible",typeAffinity = ColumnInfo.INTEGER)
    var idCombustible:Integer,

    @NonNull
    @ColumnInfo(name="combustibles",typeAffinity = ColumnInfo.TEXT)
    var combustibles:String
){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
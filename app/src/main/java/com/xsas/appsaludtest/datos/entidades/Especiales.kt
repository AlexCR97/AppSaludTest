package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigInteger
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT

@Entity(tableName= "especiales" )
data class Especiales(
    @NonNull
    @ColumnInfo(name="id_especial",typeAffinity = INTEGER)
    var idEspecial : Int,

    @NonNull
    @ColumnInfo(name="especial",typeAffinity = TEXT)
    var especial: String
){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
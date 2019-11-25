package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigInteger
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT

@Entity(tableName= "discapacidades" )
data class Discapacidades(
    @NonNull
    @ColumnInfo(name="id_discapacidad",typeAffinity = INTEGER)
    var idDiscapacidad : Int,

    @NonNull
    @ColumnInfo(name="discapacidad",typeAffinity = TEXT)
    var discapacidad: String
){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
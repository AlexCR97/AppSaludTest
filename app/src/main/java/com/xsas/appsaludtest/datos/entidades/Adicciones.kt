package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigInteger
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT

@Entity(tableName= "adicciones" )
data class Adicciones(
    @NonNull
    @ColumnInfo(name="id_adiccion",typeAffinity = INTEGER)
    var idAdiccion : Int,

    @NonNull
    @ColumnInfo(name="adiccion",typeAffinity = TEXT)
    var adiccion: String
){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
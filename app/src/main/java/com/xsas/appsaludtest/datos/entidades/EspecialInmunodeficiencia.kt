package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo.INTEGER

@Entity(tableName= "especial_inmunodeficiencia" )
data class EspecialInmunodeficiencia(
    @NonNull
    @ColumnInfo(name="id_especial",typeAffinity = INTEGER)
    var idEspecial : Int,

    @NonNull
    @ColumnInfo(name="id_inmunizacion",typeAffinity = INTEGER)
    var idInmunizacion: Long
){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
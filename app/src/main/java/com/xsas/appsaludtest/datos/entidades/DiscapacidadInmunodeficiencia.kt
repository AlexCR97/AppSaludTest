package com.xsas.appsaludtest.datos.entidades


import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigInteger
import androidx.room.ColumnInfo.INTEGER

@Entity(tableName= "dicapacidad_inmunodeficiencia" )
data class DiscapacidadInmunodeficiencia(
    @NonNull
    @ColumnInfo(name="id_discapacidad",typeAffinity = INTEGER)
    var idDiscapacidad : Int,

    @NonNull
    @ColumnInfo(name="id_inmunizacion",typeAffinity = INTEGER)
    var idInmunizacion: Long
){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
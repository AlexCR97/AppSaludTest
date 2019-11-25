package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.INTEGER

   
@Entity(tableName= "adiccion_inmunodeficiencia" )
data class AdiccionInmunodeficiencia(
    @NonNull
    @ColumnInfo(name="id_adiccion",typeAffinity = INTEGER)
    var idAdiccion : Int,

    @NonNull
    @ColumnInfo(name="id_inmunizacion",typeAffinity = INTEGER)
    var idInmunizacion : Long,

    @NonNull
    @ColumnInfo(name="veces_dia",typeAffinity = INTEGER)
    var vecesDia : Int,
  
    @NonNull
    @ColumnInfo(name="veces_semana",typeAffinity = INTEGER)
    var vecesSemana : Int
){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "adiccion_inmunodeficiencia")
data class AdiccionInmunodeficiencia (
    @NonNull
    @ColumnInfo(name="id_adiccion",typeAffinity = ColumnInfo.INTEGER)
    var idAdiccion:Integer,

    @NonNull
    @ColumnInfo(name="id_inmunizacion",typeAffinity = ColumnInfo.INTEGER)
    var idInmunizacion:Integer,

    @NonNull
    @ColumnInfo(name="veces_dia",typeAffinity = ColumnInfo.INTEGER)
    var vecesDia:Integer,

    @NonNull
    @ColumnInfo(name="vecesSemana",typeAffinity = ColumnInfo.INTEGER)
    var vecesSemana:Integer

    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
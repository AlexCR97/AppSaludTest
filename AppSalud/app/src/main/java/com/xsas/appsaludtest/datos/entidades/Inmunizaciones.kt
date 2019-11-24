package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName="inmunizaciones")
data class Inmunizaciones(
    @NonNull
    @ColumnInfo(name="id_inmunizacion",typeAffinity = INTEGER)
    var idInmunizaciones: Integer,



    //AQUI EN ESTA NO SUPE COMO PONER UNO BOOL Y LO PUSE DE TEXT
    @NonNull
    @ColumnInfo(name="cartilla",typeAffinity = TEXT)
    var cartilla:String,

    @NonNull
    @ColumnInfo(name="id_datos_generales",typeAffinity = INTEGER)
    var idDatosGenerales1: Integer
)

{
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
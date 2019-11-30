package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "entrevista")
data class Entrevista (

    @NonNull
    @ColumnInfo(name="id_entrevista",typeAffinity = ColumnInfo.INTEGER)
    var idEntrevista:Integer,

    @NonNull
    @ColumnInfo(name="id_entrevistador",typeAffinity = ColumnInfo.INTEGER)
    var id_entrevistador:Integer,

    @NonNull
    @ColumnInfo(name="fecha",typeAffinity = ColumnInfo.TEXT)
    var fecha:String,


    //
    @NonNull
    @ColumnInfo(name="latitud",typeAffinity = ColumnInfo.INTEGER)
    var latitud:Integer,

    //
    @NonNull
    @ColumnInfo(name="longitud",typeAffinity = ColumnInfo.INTEGER)
    var longitud:Integer,

    @NonNull
    @ColumnInfo(name="id_vivienda",typeAffinity = ColumnInfo.INTEGER)
    var idVivienda:Integer,

    @NonNull
    @ColumnInfo(name="id_unidad",typeAffinity = ColumnInfo.INTEGER)
    var idUnidad:Integer


    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
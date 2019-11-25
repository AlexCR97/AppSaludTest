package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "entrevistador")
data class Entrevistador (
    @NonNull
    @ColumnInfo(name="id_entrevistador",typeAffinity = ColumnInfo.INTEGER)
    var idEntrevistador:Integer,

    @NonNull
    @ColumnInfo(name="id_datos_basicos",typeAffinity = ColumnInfo.INTEGER)
    var idDatosBasicos:Integer



    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
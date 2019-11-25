package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "discapacidad_inmunodeficiencia")
data class DiscapacidadInmunodeficiencia (
    @NonNull
    @ColumnInfo(name="id_discapacidad",typeAffinity = ColumnInfo.INTEGER)
    var idDiscapacidad:Integer,

    @NonNull
    @ColumnInfo(name="id_inmunizacion",typeAffinity = ColumnInfo.INTEGER)
    var idInmunizacion:Integer
    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
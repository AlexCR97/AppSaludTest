package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "canceres")
data class Cancer (
    @NonNull
    @ColumnInfo(name="id_cancer",typeAffinity = ColumnInfo.INTEGER)
    var idCancer:Integer,

    @NonNull
    @ColumnInfo(name="id_datos_generales",typeAffinity = ColumnInfo.INTEGER)
    var idDatosGenerales:Integer
    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}

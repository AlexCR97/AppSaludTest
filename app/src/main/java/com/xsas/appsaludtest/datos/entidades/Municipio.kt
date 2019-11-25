package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "municipios")
data class Municipio (
    @NonNull
    @ColumnInfo(name="id_municipios",typeAffinity = ColumnInfo.INTEGER)
    var idMunicipios:Integer,

    @NonNull
    @ColumnInfo(name="municipio",typeAffinity = ColumnInfo.TEXT)
    var municipio:String

    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
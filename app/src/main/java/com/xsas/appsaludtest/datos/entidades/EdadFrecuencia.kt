package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "edades_frecuencias")
data class EdadFrecuencia (
    @NonNull
    @ColumnInfo(name="id_edad_frecuencia",typeAffinity = INTEGER)
    var idEdadFrecuencia:Integer,

    @NonNull
    @ColumnInfo(name="edad_frecuencia",typeAffinity = TEXT)
    var edadFrecuencia:String
){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
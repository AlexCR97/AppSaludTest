package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "metodos_anticonceptivos")
data class MetodoAnticonceptivo (
    @NonNull
    @ColumnInfo(name="id_metodo",typeAffinity = INTEGER)
    var idMetodo:Integer,

    @NonNull
    @ColumnInfo(name="metodo_anticonceptivo",typeAffinity = TEXT)
    var metodoAnticonceptivo: String,

    @NonNull
    @ColumnInfo(name="sexo",typeAffinity = TEXT)
    var sexo:String


){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
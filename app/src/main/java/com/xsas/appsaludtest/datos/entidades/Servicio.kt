package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.ColumnInfo.INTEGER
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName="servicios")
data class Servicio (
    @NonNull
    @ColumnInfo(name="id_servicio",typeAffinity=INTEGER)
    var idServicio:Integer,

    @NonNull
    @ColumnInfo(name="servicio",typeAffinity = TEXT)
    var servicio:String
)

{
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0

}
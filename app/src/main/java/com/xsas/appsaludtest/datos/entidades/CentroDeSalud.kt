package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "centro_de_salud")
data class CentroDeSalud (
    @NonNull
    @ColumnInfo(name="id_centro",typeAffinity = ColumnInfo.INTEGER)
    var idCentro:Integer,

    @NonNull
    @ColumnInfo(name="centro",typeAffinity = ColumnInfo.TEXT)
    var centro:String


    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
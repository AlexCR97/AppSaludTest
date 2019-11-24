package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "energias")
data class Energia (

    @NonNull
    @ColumnInfo(name="id_energia",typeAffinity = INTEGER)
    var idEnergia: Integer,

    @NonNull
    @ColumnInfo(name="energia",typeAffinity = TEXT)
    var energia:String


){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
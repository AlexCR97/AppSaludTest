package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mascotas")
data class Mascota (
    @NonNull
    @ColumnInfo(name="id_mascota",typeAffinity = ColumnInfo.INTEGER)
    var idMascota:Integer,

    @NonNull
    @ColumnInfo(name="mascota",typeAffinity = ColumnInfo.TEXT)
    var mascota:String


    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
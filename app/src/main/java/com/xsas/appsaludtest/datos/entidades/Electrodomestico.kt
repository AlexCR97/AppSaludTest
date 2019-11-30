package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "electrodomesticos")
data class Electrodomestico (
    @NonNull
    @ColumnInfo(name="id_electro_domestico",typeAffinity = ColumnInfo.INTEGER)
    var idElectrodomestico:Integer,

    @NonNull
    @ColumnInfo(name="electro_domestico",typeAffinity = ColumnInfo.TEXT)
    var electrodomestico:String

    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
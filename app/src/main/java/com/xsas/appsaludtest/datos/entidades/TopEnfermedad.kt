package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "top_enfermedades")
data class TopEnfermedad (
    @NonNull
    @ColumnInfo(name="id_top_enfermedades",typeAffinity = ColumnInfo.INTEGER)
    var idTopEnfermedades:Integer,

    @NonNull
    @ColumnInfo(name="enfermedad",typeAffinity = ColumnInfo.TEXT)
    var enfermedad:String

    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
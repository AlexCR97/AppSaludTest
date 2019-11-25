package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "jurisdicciones")
data class Jurisdiccion (
    @NonNull
    @ColumnInfo(name="id_jurisdiccion",typeAffinity = ColumnInfo.INTEGER)
    var idJurisdiccion:Integer,

    @NonNull
    @ColumnInfo(name="jurisdiccion",typeAffinity = ColumnInfo.TEXT)
    var jurisdiccion:String

    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
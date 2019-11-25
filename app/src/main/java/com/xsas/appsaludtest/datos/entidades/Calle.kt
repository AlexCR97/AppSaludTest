package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.ColumnInfo.INTEGER
import androidx.room.Entity

import androidx.room.PrimaryKey
@Entity(tableName = "calles")
data class Calle(
    @NonNull
    @ColumnInfo(name="id_calle",typeAffinity = INTEGER)
    var idCalle: Int,

    @NonNull
    @ColumnInfo(name="calle",typeAffinity = TEXT)
    var idColonia: String
){
    @PrimaryKey(autoGenerate = true)
    var id: Int?=0
}
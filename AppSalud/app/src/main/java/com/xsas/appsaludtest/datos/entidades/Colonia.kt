package com.xsas.appsaludtest.datos.entidades


import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

import androidx.room.PrimaryKey

@Entity(tableName= "colonias")
data class Colonia(
    @NonNull
    @ColumnInfo(name="id_colonia",typeAffinity = TEXT)
    var idColonia: Int,

    @NonNull
    @ColumnInfo(name="colonia",typeAffinity = TEXT)
    var colonia:String
){
    @PrimaryKey(autoGenerate = true)
    var id: Int?=0
}
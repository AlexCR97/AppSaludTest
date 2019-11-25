package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "materiales")
data class Material (
    @NonNull
    @ColumnInfo(name="id_material",typeAffinity = INTEGER)
    var idMaterial:Integer,

    @NonNull
    @ColumnInfo(name="material",typeAffinity = TEXT)
    var material:String


){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
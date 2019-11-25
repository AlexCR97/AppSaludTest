package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "discapacidades")
data class Discapacidad (
    @NonNull
    @ColumnInfo(name="id_discapacidad",typeAffinity = ColumnInfo.INTEGER)
    var idDiscapacidad:Integer,

    @NonNull
    @ColumnInfo(name="discapacidad",typeAffinity = ColumnInfo.TEXT)
    var discapacidad:String

    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
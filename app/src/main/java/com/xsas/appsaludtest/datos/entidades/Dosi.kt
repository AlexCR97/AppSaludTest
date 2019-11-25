package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "dosis")
data class Dosi(
    @NonNull
    @ColumnInfo(name="id_dosis",typeAffinity = INTEGER)
    var idDosis:Integer,

    @NonNull
    @ColumnInfo(name="dosis",typeAffinity = TEXT)
    var dosis:String
) {
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "desagues")
data class Desague (
    @NonNull
    @ColumnInfo(name="id_desague",typeAffinity = INTEGER)
    var idDesague: Integer,

    @NonNull
    @ColumnInfo(name="desagues",typeAffinity = TEXT)
    var desagues:String
){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
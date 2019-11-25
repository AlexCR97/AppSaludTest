package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "nacionalidades")
data class Nacionalidad (
    @NonNull
    @ColumnInfo(name="id_nacionalidad",typeAffinity = INTEGER)
    var idNacionalidad: Integer,

    @NonNull
    @ColumnInfo(name="nacionalidad",typeAffinity = TEXT)
    var nacionalidad: String
)


{
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
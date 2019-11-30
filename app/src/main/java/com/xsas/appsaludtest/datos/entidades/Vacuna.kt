package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName="vacunas")
data class Vacuna (
    @NonNull
    @ColumnInfo(name="id_vacuna",typeAffinity = INTEGER)
    var idVacuna:Integer,


    @NonNull
    @ColumnInfo(name="vacuna",typeAffinity = TEXT)
    var vacuna:String,

    @NonNull
    @ColumnInfo(name="enfermedad_previene",typeAffinity = TEXT)
    var enfermedadPreviene:String
)
{
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0


}
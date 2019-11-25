package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "especial_inmunodeficiencia")
data class EspecialInmunodeficiencia (
    @NonNull
    @ColumnInfo(name="id_especial",typeAffinity = ColumnInfo.INTEGER)
    var idEspecial:Integer,

    @NonNull
    @ColumnInfo(name="id_inmunizacion",typeAffinity = ColumnInfo.INTEGER)
    var idInmunizacion:Integer


    ){@PrimaryKey(autoGenerate = true)
var id:Int?=0
}
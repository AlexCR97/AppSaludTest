package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "equipamientos_combustibles")

data class EquipamientoCombustible (
    @NonNull
    @ColumnInfo(name="id_equipamiento",typeAffinity = ColumnInfo.INTEGER)
    var idEquipamiento:Integer,

    @NonNull
    @ColumnInfo(name="id_combustible",typeAffinity = ColumnInfo.INTEGER)
    var idCombustible:Integer

    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
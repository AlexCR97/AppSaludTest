package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "equipamientos")
data class Equipamiento(
    @NonNull
    @ColumnInfo(name="id_equipamiento",typeAffinity = ColumnInfo.INTEGER)
    var idEquipamiento:Integer,

    @NonNull
    @ColumnInfo(name="id_vivienda",typeAffinity = ColumnInfo.INTEGER)
    var idVivienda:Integer
    ) {
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}

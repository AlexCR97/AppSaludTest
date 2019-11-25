package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "equipamientos_electrodomesticos")
data class EquipamientoElectrodomestico (
    @NonNull
    @ColumnInfo(name="id_equipamiento",typeAffinity = ColumnInfo.INTEGER)
    var idEquipamiento:Integer,

    @NonNull
    @ColumnInfo(name="id_electro_domestico",typeAffinity = ColumnInfo.INTEGER)
    var idElectrodomestico:Integer
    ){

    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cuenta_con_vivienda")
data class CuentaConVivienda (
    @NonNull
    @ColumnInfo(name = "id_cuenta",typeAffinity = INTEGER)
    var idCuenta:Integer,

    @NonNull
    @ColumnInfo(name="id_caracteristica",typeAffinity = INTEGER)
    var idCaracteristica:Integer


){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
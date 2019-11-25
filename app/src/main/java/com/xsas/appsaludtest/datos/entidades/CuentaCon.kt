package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "cuenta_con")
data class CuentaCon (
    @NonNull
    @ColumnInfo(name="id_cuenta",typeAffinity = INTEGER)
    var idCuenta:Integer,

    @NonNull
    @ColumnInfo(name="espacio",typeAffinity = TEXT)
    var espacio:String


){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
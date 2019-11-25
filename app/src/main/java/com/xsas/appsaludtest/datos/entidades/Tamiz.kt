package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo.BINARY
import androidx.room.ColumnInfo.INTEGER

@Entity(tableName= "tamiz" )
data class Tamiz(
    @NonNull
    @ColumnInfo(name="neonatal",typeAffinity = BINARY)
    var neonatal : Boolean,

    @NonNull
    @ColumnInfo(name="auditivo",typeAffinity = BINARY)
    var auditivo: Boolean,

    @NonNull
    @ColumnInfo(name="id_inmunizacion",typeAffinity = INTEGER)
    var idInmunizacion: Long
){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
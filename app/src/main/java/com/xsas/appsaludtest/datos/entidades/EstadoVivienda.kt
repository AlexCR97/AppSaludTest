package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigInteger

import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT




@Entity(tableName = "estados_viviendas")
data class EstadoVivienda(
    @NonNull
    @ColumnInfo(name="id_estado",typeAffinity = INTEGER)
    var idEstado: BigInteger,

    @NonNull
    @ColumnInfo(name="estado_vivienda",typeAffinity = TEXT)
    var estadoVivienda: String

) {
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
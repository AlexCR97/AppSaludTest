package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigInteger


@Entity(tableName = "estados_viviendas")
data class EstadoVivienda(
    @NonNull
    @ColumnInfo(name="id_estado",typeAffinity = ColumnInfo.INTEGER)
    var idEstado: BigInteger,

    @NonNull
    @ColumnInfo(name="estado_vivienda",typeAffinity = ColumnInfo.TEXT)
    var estadoVivienda: String

) {
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
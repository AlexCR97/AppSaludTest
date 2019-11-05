package com.ale.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigInteger


@Entity(tableName = "estados_viviendas")
data class EstadosVivienda(
    @NonNull
    @ColumnInfo(name="id_estado",typeAffinity = TEXT)
    var idEstado:BigInteger,

    @NonNull
    @ColumnInfo(name="estado_vivienda",typeAffinity = TEXT)
    var estadoVivienda: String

) {
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
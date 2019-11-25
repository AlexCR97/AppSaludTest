package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.Entity
import androidx.room.ColumnInfo.TEXT
import androidx.room.PrimaryKey

@Entity(tableName = "unidad_de_atencion")
data class UnidadAtencion(
    @NonNull
    @ColumnInfo(name="id_unidad",typeAffinity = INTEGER)
    var idUnidad: Int,

    @NonNull
    @ColumnInfo(name="id_jurisdiccion",typeAffinity = INTEGER)
    var idJurisdiccion: Int,

    @NonNull
    @ColumnInfo(name="id_municipio",typeAffinity = INTEGER)
    var idMunicipio: Int,

    @NonNull
    @ColumnInfo(name="id_centro",typeAffinity = TEXT)
    var idCentro: String
){
    @PrimaryKey(autoGenerate = true)
    var id: Int?=0
}
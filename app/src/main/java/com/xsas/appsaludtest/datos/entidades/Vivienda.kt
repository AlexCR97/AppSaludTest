package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ColumnInfo.INTEGER;
import androidx.room.ColumnInfo.TEXT;
import androidx.room.PrimaryKey


@Entity(tableName = "viviendas")
data class Vivienda(
    @NonNull
    @ColumnInfo(name = "id_vivienda", typeAffinity = INTEGER )
    var idVivienda: Int,

    @NonNull
    @ColumnInfo(name = "id_colonia", typeAffinity = TEXT)
    var IdColonia:String,

    @NonNull
    @ColumnInfo(name = "id_calle", typeAffinity = TEXT)
    var IdCalle:String,

    @NonNull
    @ColumnInfo(name = "numero_ext", typeAffinity = INTEGER)
    var numeroExterior:Int,

    @NonNull
    @ColumnInfo(name = "numero_int", typeAffinity = INTEGER)
    var numeroInterior:Int,

    @NonNull
    @ColumnInfo(name = "codigo_postal", typeAffinity = INTEGER)
    var codigoPostal:Int,

    @NonNull
    @ColumnInfo(name = "telefono_casa", typeAffinity = TEXT)
    var telefonoCasa:String,

    @NonNull
    @ColumnInfo(name = "referencia_de_ubicacion", typeAffinity = TEXT)
    var referenciaDeUbicacion:String,

    @NonNull
    @ColumnInfo(name = "id_unidad", typeAffinity = INTEGER)
    var IdUnidad:Int
){
    @PrimaryKey(autoGenerate = true)
    var id: Int?=0
}
package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "caracteristicas")
data class CaracteristicaVivienda (
    @NonNull
    @ColumnInfo(name="id_caracteristica",typeAffinity = INTEGER)
    var idCaracteristica:Integer,

    @NonNull
    @ColumnInfo(name="muros_materiales",typeAffinity =INTEGER)
    var murosMateriales:Integer,

    @NonNull
    @ColumnInfo(name="piso_materiales",typeAffinity =INTEGER)
    var pisoMateriales:Integer,

    @NonNull
    @ColumnInfo(name="techos_materiales",typeAffinity =INTEGER)
    var techosMateriales:Integer,

    @NonNull
    @ColumnInfo(name="id_desague",typeAffinity =INTEGER)
    var idDesague:Integer,

    @NonNull
    @ColumnInfo(name="id_energia",typeAffinity =INTEGER)
    var idEnergia:Integer,

    @NonNull
    @ColumnInfo(name="numero_de_cuartos",typeAffinity =INTEGER)
    var numeroDeCuartos:Integer,

    //tambine era bool
    @NonNull
    @ColumnInfo(name="huerto",typeAffinity =INTEGER)
    var huerto:Integer,

    @NonNull
    @ColumnInfo(name="id_vivienda",typeAffinity =INTEGER)
    var idVivienda:Integer


){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
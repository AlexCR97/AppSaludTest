package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "fisiologicos")
data class Fisiologico (
    @NonNull
    @ColumnInfo(name="id_tipo_alimentacion",typeAffinity = ColumnInfo.INTEGER)
    var idTipoAlimentacion:Integer,

    @NonNull
    @ColumnInfo(name="veces_dia",typeAffinity = ColumnInfo.INTEGER)
    var vecesDia:Integer,

    @NonNull
    @ColumnInfo(name="veces_semana",typeAffinity = ColumnInfo.INTEGER)
    var vecesSemana:Integer,

    @NonNull
    @ColumnInfo(name="id_antecedentes_personales",typeAffinity = ColumnInfo.INTEGER)
    var idAntecedentesPersonales:Integer


    ){
}
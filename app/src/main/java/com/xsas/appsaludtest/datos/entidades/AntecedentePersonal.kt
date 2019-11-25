package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "antecedentes_personales")
data class AntecedentePersonal (
    @NonNull
    @ColumnInfo(name="id_antecedentes_personales",typeAffinity = ColumnInfo.INTEGER)
    var idAntecedentesPersonales:Integer,

    @NonNull
    @ColumnInfo(name="id_datos_generales",typeAffinity = ColumnInfo.INTEGER)
    var idDatosGenerales:Integer

    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
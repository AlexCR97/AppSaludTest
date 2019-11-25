package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "antecedentes_personales_enfermedades")
data class AntecedentePersonalEnfermedad (
    @NonNull
    @ColumnInfo(name="id_top_enfermedades",typeAffinity = ColumnInfo.INTEGER)
    var idTopEnfermedades:Integer,

    @NonNull
    @ColumnInfo(name="id_antecedentes_personales",typeAffinity = ColumnInfo.INTEGER)
    var idAntecedentesPersonalesEnfermedades:Integer,

    @NonNull
    @ColumnInfo(name="otro",typeAffinity = ColumnInfo.TEXT)
    var otro:String



    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
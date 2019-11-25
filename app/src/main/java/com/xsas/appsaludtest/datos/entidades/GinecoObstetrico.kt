package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ginecos_obstetricos")
data class GinecoObstetrico (
    @NonNull
    @ColumnInfo(name="menarca",typeAffinity = ColumnInfo.TEXT)
    var menarca:String,

    @NonNull
    @ColumnInfo(name="gestas",typeAffinity = ColumnInfo.INTEGER)
    var gestas:Integer,

    @NonNull
    @ColumnInfo(name="cesareas",typeAffinity = ColumnInfo.INTEGER)
    var cesareas:Integer,

    @NonNull
    @ColumnInfo(name="abortos",typeAffinity = ColumnInfo.INTEGER)
    var abortos:Integer,

    @NonNull
    @ColumnInfo(name="id_antecedentes_personales",typeAffinity = ColumnInfo.INTEGER)
    var idAntecedentesPersonales:Integer,

    @NonNull
    @ColumnInfo(name="id_flujos",typeAffinity = ColumnInfo.INTEGER)
    var idFlujos:Integer


    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
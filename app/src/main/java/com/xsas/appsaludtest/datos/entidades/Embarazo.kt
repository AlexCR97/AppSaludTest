package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="embarazos")
data class Embarazo (

    //
    @NonNull
    @ColumnInfo(name="madre_soltera",typeAffinity = INTEGER)
    var madreSoltera:Integer,

    @NonNull
    @ColumnInfo(name="trimestre",typeAffinity = INTEGER)
    var trimestre:Integer,

    @NonNull
    @ColumnInfo(name="id_planificaciones_familiares",typeAffinity = INTEGER)
    var idPlanificacionesFamiliares:Integer,

    @NonNull
    @ColumnInfo(name="fmu",typeAffinity = TEXT)
    var fmu:String,

    @NonNull
    @ColumnInfo(name="ftp",typeAffinity = TEXT)
    var ftp:String



){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
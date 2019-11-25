package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "mujeres_adultas")
data class MujerAdulta(

    @NonNull
    @ColumnInfo(name="ultima_regla",typeAffinity = TEXT)
    var ultimaRegla:String,


    //es boolean
    @NonNull
    @ColumnInfo(name="menopausia_control",typeAffinity = ColumnInfo.INTEGER)
    var menopausiaControl:Integer,

    @NonNull
    @ColumnInfo(name="id_planificaciones_familiares",typeAffinity = ColumnInfo.INTEGER)
    var idPlanificacionesFamiliares:Integer

    ) {
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
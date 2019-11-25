package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "planificaciones_familiares_metodos_definitivo")
data class PlanificacionFamiliarMetodoDefinitivo (
    @NonNull
    @ColumnInfo(name="id_planificaciones_familiares",typeAffinity = ColumnInfo.INTEGER)
    var idPlanificacionesFamiliares:Integer,

    @NonNull
    @ColumnInfo(name="id_metodo_definitivo",typeAffinity = ColumnInfo.INTEGER)
    var idMetodoDefinitivo:Integer
    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
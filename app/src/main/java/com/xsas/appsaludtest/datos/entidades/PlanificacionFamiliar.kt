package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName="planificaciones_familiares")
data class PlanificacionFamiliar (
    @NonNull
    @ColumnInfo(name="id_planificaciones_familiares",typeAffinity = INTEGER)
    var idPlanificacionesFamiliares:Integer,

    @NonNull
    @ColumnInfo(name="id_datos_generales",typeAffinity = INTEGER)
    var idDatosGenerales:Integer


){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
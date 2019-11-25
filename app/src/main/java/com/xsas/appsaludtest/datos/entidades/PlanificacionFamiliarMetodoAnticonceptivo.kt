package com.xsas.appsaludtest.datos.entidades

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="planificaciones_familiares_metodos_anticonceptivos")

data class PlanificacionFamiliarMetodoAnticonceptivo (
    @NonNull
    @ColumnInfo(name="id_planificacion_anticonceptivos",typeAffinity = ColumnInfo.INTEGER)
    var idPlanificacionAnticonceptivos:Integer,

    @NonNull
    @ColumnInfo(name="id_metodo",typeAffinity = ColumnInfo.INTEGER)
    var idMetodo:Integer





    ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=0
}
package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.INTEGER
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "DatosGenerales2")
data class DatosGenerales2(
    @NonNull
    @ColumnInfo(name="edad", typeAffinity = INTEGER)
    var edad: Int = -1,

    @NonNull
    @ColumnInfo(name="servicioMedico", typeAffinity = TEXT)
    var servicioMedico: String = "",

    @NonNull
    @ColumnInfo(name="ocupacion", typeAffinity = TEXT)
    var ocupacion: String = "",

    @NonNull
    @ColumnInfo(name="estadoCivil", typeAffinity = TEXT)
    var estadoCivil: String = "",

    @NonNull
    @ColumnInfo(name="nacionalidad", typeAffinity = TEXT)
    var nacionalidad: String = "",

    @NonNull
    @ColumnInfo(name="residenciaAnterior", typeAffinity = TEXT)
    var residenciaAnterior: String = "",

    @NonNull
    @ColumnInfo(name="ultimoGradoEstudio", typeAffinity = TEXT)
    var ultimoGradoEstudio: String = ""
) : VistaEncuesta()
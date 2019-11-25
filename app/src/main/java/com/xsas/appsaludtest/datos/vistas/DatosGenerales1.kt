package com.xsas.appsaludtest.datos.vistas

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.TEXT
import androidx.room.Entity

@Entity(tableName = "DatosGenerales1")
data class DatosGenerales1(
    @NonNull
    @ColumnInfo(name = "apellidoPaterno", typeAffinity = TEXT)
    var apellidoPaterno: String = "",

    @NonNull
    @ColumnInfo(name ="apellidoMaterno", typeAffinity = TEXT)
    var apellidoMaterno: String = "",

    @NonNull
    @ColumnInfo(name = "nombres",typeAffinity = TEXT)
    var nombres: String = "",

    @NonNull
    @ColumnInfo(name = "sexo",typeAffinity = TEXT)
    var sexo: String = "",

    @NonNull
    @ColumnInfo(name = "curp",typeAffinity = TEXT)
    var curp: String = "",

    @NonNull
    @ColumnInfo(name = "fechaNacimiento",typeAffinity = TEXT)
    var fechaNacimiento: String = ""
) : VistaEncuesta() {

    val nombreCompleto: String
    get() = "${nombres} ${apellidoPaterno} ${apellidoMaterno}"

}

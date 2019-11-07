package com.xsas.appsaludtest.datos.vistas

import androidx.room.Entity

@Entity(tableName= "datos_Generales_1")
data class DatosGenerales1(
    var apellidoPaterno: String = "",
    var apellidoMaterno: String = "",
    var nombres: String = "",
    var sexo: String = "",
    var curp: String = "",
    var fechaNacimiento: String = ""
)
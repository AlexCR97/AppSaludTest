package com.xsas.appsaludtest.datos.vistas

import androidx.room.Entity

@Entity(tableName = "datos_Personales")
data class DatosPersonales(
    var nombres: String,
    var apellidoPaterno: String,
    var apellidoMaterno: String,
    var sexo: String,
    var fechaNacimiento: String
)

package com.xsas.appsaludtest.datos.vistas

import androidx.room.Entity

@Entity(tableName= "datos_Generales_2")
data class DatosGenerales2(
    var edad: Int = -1,
    var servicioMedico: String = "",
    var ocupacion: String = "",
    var estadoCivil: String = "",
    var nacionalidad: String = "",
    var residenciaAnterior: String = "",
    var ultimoGradoEstudio: String = ""
)

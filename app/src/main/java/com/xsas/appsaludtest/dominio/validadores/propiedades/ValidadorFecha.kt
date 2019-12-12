package com.xsas.appsaludtest.dominio.validadores.propiedades

import com.xsas.appsaludtest.dominio.validadores.Validador

class ValidadorFecha(t: String) : Validador<String>(t) {

    override fun definirValidaciones() {

        agregarValidacion(object : ValidadorPropiedad {

            override fun validar(): Boolean {
                return try {
                    val tokens: List<String> = t.split("-")
                    tokens[0].toInt()
                    tokens[1].toInt()
                    tokens[2].toInt()
                    true
                } catch (ex: Exception) {
                    return false
                }
            }
        }, object : ErrorValidacion {

            override fun mensajeError(): String {
                return "Debes ingresar un fecha con el siguiente formato: AAAA-DD-MM"
            }

            override fun propiedadInvalida(): Any {
                return t
            }
        })
    }
}

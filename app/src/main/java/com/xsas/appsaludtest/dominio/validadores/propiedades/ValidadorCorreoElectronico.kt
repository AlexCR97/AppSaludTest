package com.xsas.appsaludtest.dominio.validadores.propiedades

import com.xsas.appsaludtest.dominio.validadores.Validador
import java.lang.Exception

class ValidadorCorreoElectronico(t: String) : Validador<String>(t) {

    override fun definirValidaciones() {

        agregarValidacion(object : ValidadorPropiedad {

            override fun validar(): Boolean {
                return t.isNotBlank()
            }

        }, object : ErrorValidacion {

            override fun mensajeError(): String {
                return "Debes ingresar un correo"
            }

            override fun propiedadInvalida(): Any {
                return t
            }
        })

        agregarValidacion(object : ValidadorPropiedad {

            override fun validar(): Boolean {
                return try {
                    val tokens: List<String> = t.split("@")
                    tokens[1].contains(".")
                } catch (ex: Exception) {
                    false
                }
            }

        }, object : ErrorValidacion {

            override fun mensajeError(): String {
                return "El correo debe de tener el siguiente formato: correo@ejemplo.com"
            }

            override fun propiedadInvalida(): Any {
                return t
            }
        })
    }
}

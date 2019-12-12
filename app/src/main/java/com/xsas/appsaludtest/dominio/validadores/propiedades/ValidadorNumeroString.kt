package com.xsas.appsaludtest.dominio.validadores.propiedades

import com.xsas.appsaludtest.dominio.validadores.Validador
import java.lang.Exception

class ValidadorNumeroString(t: String) : Validador<String>(t) {

    override fun definirValidaciones() {
        agregarValidacion(object : ValidadorPropiedad {

            override fun validar(): Boolean {
                return try {
                    t.toDouble()
                    true
                } catch (ex: Exception) {
                    false
                }
            }

        }, object : ErrorValidacion {

            override fun mensajeError(): String {
                return "Debes ingresar un numero"
            }

            override fun propiedadInvalida(): Any {
                return t
            }
        })
    }
}

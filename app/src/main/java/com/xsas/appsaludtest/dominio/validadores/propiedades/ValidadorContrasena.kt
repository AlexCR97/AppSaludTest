package com.xsas.appsaludtest.dominio.validadores.propiedades

import com.xsas.appsaludtest.dominio.validadores.Validador

class ValidadorContrasena(t: String) : Validador<String>(t) {

    override fun definirValidaciones() {

        agregarValidacion(object : ValidadorPropiedad {

            override fun validar(): Boolean {
                return t.isNotBlank()
            }

        }, object : ErrorValidacion {

            override fun mensajeError(): String {
                return "Debes ingresar una contraseña"
            }

            override fun propiedadInvalida(): Any {
                return t
            }
        })

        agregarValidacion(object : ValidadorPropiedad {

            override fun validar(): Boolean {
                return t.length >= 6
            }

        }, object : ErrorValidacion {

            override fun mensajeError(): String {
                return "La contraseña debe de tener al menos 6 caracteres"
            }

            override fun propiedadInvalida(): Any {
                return t
            }
        })
    }
}

package com.xsas.appsaludtest.dominio.validadores.propiedades

import com.xsas.appsaludtest.dominio.validadores.Validador

class ValidadorStringNoVacio(t: String) : Validador<String>(t) {

    override fun definirValidaciones() {

        agregarValidacion(object : ValidadorPropiedad {

            override fun validar(): Boolean {
                return t.isNotBlank()
            }

        }, object : ErrorValidacion {

            override fun propiedadInvalida(): Any {
                return t;
            }

            override fun mensajeError(): String {
                return "El campo no puede estar vacio"
            }
        })
    }
}

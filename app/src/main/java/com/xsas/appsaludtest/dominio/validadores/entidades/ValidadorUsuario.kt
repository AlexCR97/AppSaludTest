package com.xsas.appsaludtest.dominio.validadores.entidades

import com.xsas.appsaludtest.datos.entidades.Usuario
import com.xsas.appsaludtest.dominio.validadores.Validador

class ValidadorUsuario(t: Usuario) : Validador<Usuario>(t) {

    override fun definirValidaciones() {

        // nombre de usuario
        agregarValidacion(object :
            ValidadorPropiedad {

            override fun validar(): Boolean {
                return t.nombreUsuario.isNotBlank()
            }

        }, object : ErrorValidacion {

            override fun mensajeError(): String {
                return "Usuario name must not be blank!"
            }

            override fun propiedadInvalida(): Any {
                return t.nombreUsuario
            }
        })
    }

}
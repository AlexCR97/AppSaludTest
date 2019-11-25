package com.xsas.appsaludtest.dominio.validadores

import com.xsas.appsaludtest.datos.entidades.Colonia

class ValidadorColonia (t: Colonia) : Validador<Colonia>(t){
    override fun definirValidaciones() {
        agregarValidacion(object : ValidadorPropiedad {

            override fun validar(): Boolean {
                return t.colonia.isNotBlank()
            }

        }, object : ErrorValidacion {

            override fun mensajeError(): String {
                return "¡Colonia no debe de estar vacío!"
            }

            override fun propiedadInvalida(): Any {
                return t.colonia
            }
        })

    }

}
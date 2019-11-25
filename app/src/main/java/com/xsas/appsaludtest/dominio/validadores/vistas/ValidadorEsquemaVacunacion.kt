package com.xsas.appsaludtest.dominio.validadores.vistas

import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacion
import com.xsas.appsaludtest.dominio.validadores.Validador

class ValidadorEsquemaVacunacion (t: EsquemaVacunacion): Validador<EsquemaVacunacion>(t){
    override fun definirValidaciones() {

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {

                if(t.tieneCartilla == null)
                    return false
                return true
            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "No puede estar vacío el campo "
            }

            override fun propiedadInvalida(): Any {
                return t.tieneCartilla
            }

        })

    }

}
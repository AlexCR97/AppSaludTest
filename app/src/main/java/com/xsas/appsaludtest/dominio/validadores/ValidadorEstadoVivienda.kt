package com.xsas.appsaludtest.dominio.validadores

import com.xsas.appsaludtest.datos.entidades.EstadoVivienda

class ValidadorEstadoVivienda(t: EstadoVivienda): Validador<EstadoVivienda>(t) {
    override fun definirValidaciones() {
        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.estadoVivienda.isBlank()
            }

        }, object:ErrorValidacion{
            override fun mensajeError(): String {
                return "Estado vivienda no puede estar vacío"
            }

            override fun propiedadInvalida(): Any {
                return t.estadoVivienda
            }

        })

    }

}
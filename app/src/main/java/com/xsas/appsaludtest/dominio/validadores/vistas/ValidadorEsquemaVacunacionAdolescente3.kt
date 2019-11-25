package com.xsas.appsaludtest.dominio.validadores.vistas


import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente3
import com.xsas.appsaludtest.dominio.validadores.Validador

class ValidadorEsquemaVacunacionAdolescente3 (t: EsquemaVacunacionAdolescente3): Validador<EsquemaVacunacionAdolescente3>(t){
    override fun definirValidaciones() {

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                try {
                    var fecha = t.tdpaFechaUnica.split("-").toTypedArray()
                    if (fecha.size < 3)
                        return false

                    fecha[0].toInt()
                    fecha[1].toInt()
                    fecha[2].toInt()

                    if  (fecha[0].length < 4)
                        return false

                    if  (fecha[1].length < 2)
                        return false
                    if  (fecha[2].length < 2)
                        return false


                    fecha[0].toInt()
                    fecha[1].toInt()
                    fecha[2].toInt()

                    return true
                }catch(ex: Exception){
                    return false

                }
            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "La fecha debe de tener el siguiente formato 'YYYY'-'dd'-'mm'"
            }

            override fun propiedadInvalida(): Any {
                return t.tdpaFechaUnica
            }

        })

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.tdpaFechaUnica.isNotBlank()
            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "No puede estar vacío el campo "
            }

            override fun propiedadInvalida(): Any {
                return t.tdpaFechaUnica

            }
        })
    }

}
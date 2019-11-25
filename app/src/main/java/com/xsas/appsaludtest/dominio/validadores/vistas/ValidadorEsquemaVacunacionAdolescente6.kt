package com.xsas.appsaludtest.dominio.validadores.vistas

import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente6
import com.xsas.appsaludtest.dominio.validadores.Validador

class ValidadorEsquemaVacunacionAdolescente6 (t: EsquemaVacunacionAdolescente6): Validador<EsquemaVacunacionAdolescente6>(t){
    override fun definirValidaciones() {
        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                try {
                    var fecha = t.vphFechaPrimera.split("-").toTypedArray()
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

        },object: ErrorValidacion{
            override fun mensajeError(): String {
                return "La fecha debe de tener el siguiente formato: 'AAAA-MM-DD'"

            }

            override fun propiedadInvalida(): Any {
                return t.vphFechaPrimera
            }

        })
        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.vphFechaPrimera.isNotBlank()


            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "No puede estar vacío el campo "
            }

            override fun propiedadInvalida(): Any {
                return t.vphFechaPrimera

            }

        })

        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                try {
                    var fecha = t.vphFechaSegunda.split("-").toTypedArray()
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

        },object: ErrorValidacion{
            override fun mensajeError(): String {
                return "La fecha debe de tener el siguiente formato: 'AAAA-MM-DD'"

            }

            override fun propiedadInvalida(): Any {
                return t.vphFechaSegunda
            }

        })

        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                try {
                    var fecha = t.vphFechaTercera.split("-").toTypedArray()
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

        },object: ErrorValidacion{
            override fun mensajeError(): String {
                return "La fecha debe de tener el siguiente formato: 'AAAA-MM-DD'"

            }

            override fun propiedadInvalida(): Any {
                return t.vphFechaTercera
            }

        })



    }

}
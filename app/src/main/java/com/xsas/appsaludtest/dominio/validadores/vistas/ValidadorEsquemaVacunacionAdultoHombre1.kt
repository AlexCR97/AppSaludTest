package com.xsas.appsaludtest.dominio.validadores.vistas

import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdultoHombre1
import com.xsas.appsaludtest.dominio.validadores.Validador

class ValidadorEsquemaVacunacionAdultoHombre1 (t: EsquemaVacunacionAdultoHombre1): Validador<EsquemaVacunacionAdultoHombre1>(t){
    override fun definirValidaciones() {
        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                try {
                    var fecha = t.srEsquemaIncompletoFechaPrimera.split("-").toTypedArray()
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
                return t.srEsquemaIncompletoFechaPrimera
            }

        })
        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.srEsquemaIncompletoFechaPrimera.isNotBlank()
            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "No puede estar vacío el campo "
            }

            override fun propiedadInvalida(): Any {
                return t.srEsquemaIncompletoFechaPrimera

            }

        })

        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                try {
                    var fecha = t.srSinAntescedenteFechaPrimera.split("-").toTypedArray()
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
                return t.srSinAntescedenteFechaPrimera
            }

        })

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.srSinAntescedenteFechaPrimera.isNotBlank()


            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "No puede estar vacío el campo "
            }

            override fun propiedadInvalida(): Any {
                return t.srSinAntescedenteFechaPrimera

            }

        })


        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                try {
                    var fecha = t.srSinAntescedenteFechaSegunda.split("-").toTypedArray()
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
                return t.srSinAntescedenteFechaSegunda
            }

        })
        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.srSinAntescedenteFechaSegunda.isNotBlank()
            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "No puede estar vacío el campo "
            }

            override fun propiedadInvalida(): Any {
                return t.srSinAntescedenteFechaSegunda

            }

        })
    }

}
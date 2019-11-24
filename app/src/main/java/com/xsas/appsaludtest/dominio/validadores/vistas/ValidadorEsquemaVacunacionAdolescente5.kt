package com.xsas.appsaludtest.dominio.validadores.vistas

import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente5
import com.xsas.appsaludtest.dominio.validadores.Validador

class ValidadorEsquemaVacunacionAdolescente5 (t: EsquemaVacunacionAdolescente5): Validador<EsquemaVacunacionAdolescente5>(t){
    override fun definirValidaciones() {
        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                try {
                    var fecha = t.srFechaUnica.split("-").toTypedArray()
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
                return t.srFechaUnica
            }

        })


        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.srFechaUnica.isNotBlank()

            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "La fecha estar vacío el campo "
            }

            override fun propiedadInvalida(): Any {
                return t.srFechaUnica

            }

        })

        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                try {
                    var fecha = t.srSinAntescedenteVacunalFechaPrimera.split("-").toTypedArray()
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
                return t.srSinAntescedenteVacunalFechaPrimera
            }

        })

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.srSinAntescedenteVacunalFechaPrimera.isNotBlank()


            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "La fecha estar vacío"
            }

            override fun propiedadInvalida(): Any {
                return t.srSinAntescedenteVacunalFechaPrimera

            }

        })



        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                try {
                    var fecha = t.srSinAntescedenteVacunalFechaSegunda.split("-").toTypedArray()
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
                return t.srSinAntescedenteVacunalFechaSegunda
            }

        })

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.srSinAntescedenteVacunalFechaSegunda.isNotBlank()
            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "No puede estar vacio la fecha"
            }

            override fun propiedadInvalida(): Any {
                return t.srSinAntescedenteVacunalFechaSegunda
            }

        })

    }

}
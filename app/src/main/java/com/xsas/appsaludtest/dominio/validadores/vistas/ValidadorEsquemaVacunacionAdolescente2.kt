package com.xsas.appsaludtest.dominio.validadores.vistas

import com.xsas.appsaludtest.datos.vistas.EsquemaVacunacionAdolescente2
import com.xsas.appsaludtest.dominio.validadores.Validador

class ValidadorEsquemaVacunacionAdolescente2 (t: EsquemaVacunacionAdolescente2):Validador<EsquemaVacunacionAdolescente2>(t){
    override fun definirValidaciones() {
        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                try {
                    var fecha = t.tdEsquemaIncompletoFechaPrimera.split("-").toTypedArray()
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
                return "La fecha debe de tener el siguiente formato: 'AAAA-MM-DD'"
            }

            override fun propiedadInvalida(): Any {
                return t.tdEsquemaIncompletoFechaPrimera

            }

        })

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.tdEsquemaIncompletoFechaPrimera.isNotBlank()

            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "No puede estar vacío el campo "
            }

            override fun propiedadInvalida(): Any {
                return t.tdEsquemaIncompletoFechaPrimera

            }

        })

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                try {
                    var fecha = t.tdEsquemaIncompletoFechaSegunda.split("-").toTypedArray()
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
                return "La fecha debe de tener el siguiente formato: 'AAAA-MM-DD'"
            }

            override fun propiedadInvalida(): Any {
                return t.tdEsquemaIncompletoFechaSegunda

            }
        })

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.tdEsquemaIncompletoFechaSegunda.isNotBlank()


            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "No puede estar vacío el campo "
            }

            override fun propiedadInvalida(): Any {
                return t.tdEsquemaIncompletoFechaSegunda

            }

        })

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                try {
                    var fecha = t.tdEsquemaIncompletoFechaTercera.split("-").toTypedArray()
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
                return "La fecha debe de tener el siguiente formato: 'AAAA-MM-DD'"
            }

            override fun propiedadInvalida(): Any {
                return t.tdEsquemaIncompletoFechaTercera

            }

        })

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.tdEsquemaIncompletoFechaTercera.isNotBlank()

            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "No puede estar vacío el campo "
            }

            override fun propiedadInvalida(): Any {
                return t.tdEsquemaIncompletoFechaTercera

            }

        })

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                try {
                    var fecha = t.tdEsquemaCompletoFechaRefuerzo.split("-").toTypedArray()
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
                return "La fecha debe de tener el siguiente formato: 'AAAA-MM-DD'"
            }

            override fun propiedadInvalida(): Any {
                return t.tdEsquemaCompletoFechaRefuerzo

            }

        })

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.tdEsquemaCompletoFechaRefuerzo.isNotBlank()

            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "No puede estar vacío el campo "
            }

            override fun propiedadInvalida(): Any {
                return t.tdEsquemaCompletoFechaRefuerzo

            }

        })


    }

}
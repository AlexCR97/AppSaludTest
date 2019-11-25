package com.xsas.appsaludtest.dominio.validadores.vistas

import com.xsas.appsaludtest.datos.vistas.DatosGenerales1
import com.xsas.appsaludtest.dominio.validadores.Validador

class ValidadorDatosGenerales1 (t:DatosGenerales1): Validador<DatosGenerales1>(t){
    override fun definirValidaciones() {
        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.nombres.isNotBlank()
            }

        },object : ErrorValidacion{

            override fun mensajeError(): String {
                return "El nombre no puede estar vacío"
            }
            override fun propiedadInvalida(): Any {
                return t.nombres
            }

        })

        agregarValidacion(object :ValidadorPropiedad{
            override fun validar(): Boolean {
                val pattern = Regex("^([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\']+[\\s])+([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\'])+[\\s]?([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\'])?\$")
                if (pattern.containsMatchIn(t.nombres))
                    return true
                else
                    return false
            }

        },object : ErrorValidacion{
            override fun mensajeError(): String {
                return "El nombre solo puede contener letras de la 'A' a la 'Z'"
            }

            override fun propiedadInvalida(): Any {
                return t.nombres
            }

        })

        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.apellidoMaterno.isNotBlank()
            }

        },object: ErrorValidacion{
            override fun mensajeError(): String {
                return "El nombre no puede estar vacío"
            }

            override fun propiedadInvalida(): Any {
                return t.apellidoMaterno
            }

        })

        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                val pattern = Regex("^([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\']+[\\s])+([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\'])+[\\s]?([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\'])?\$")
                if (pattern.containsMatchIn(t.apellidoMaterno))
                    return true
                else
                    return false

            }
        },object: ErrorValidacion{
            override fun mensajeError(): String {
                return "El apellido materno solo puede contener letras de la 'A' a la 'Z'"
            }

            override fun propiedadInvalida(): Any {
                return t.apellidoMaterno
            }

        })


        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.apellidoPaterno.isNotBlank()

            }

        },object: ErrorValidacion{
            override fun mensajeError(): String {
                return "El apellido paterno no puede estar vacío"
            }

            override fun propiedadInvalida(): Any {
                return t.apellidoPaterno
            }

        })


        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                val pattern = Regex("^([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\']+[\\s])+([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\'])+[\\s]?([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\'])?\$")
                if (pattern.containsMatchIn(t.apellidoPaterno))
                    return true
                else
                    return false


            }

        },object: ErrorValidacion{
            override fun mensajeError(): String {
                return "El apellido paterno solo puede contener letras de la 'A' a la 'Z'"
            }

            override fun propiedadInvalida(): Any {
                return t.apellidoPaterno
            }

        })


        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.sexo.isNotBlank()
            }

        },object: ErrorValidacion{
            override fun mensajeError(): String {
                return "El sexo no puede estar vacío"
            }

            override fun propiedadInvalida(): Any {
                return t.sexo
            }

        })


        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.fechaNacimiento.isNotEmpty()

            }

        },object: ErrorValidacion{
            override fun mensajeError(): String {
                return "La fecha no puede estar vacía"
            }

            override fun propiedadInvalida(): Any {
                return t.fechaNacimiento
            }

        })


        agregarValidacion(object: ValidadorPropiedad{
            override fun validar(): Boolean {
                try {
                    var fecha = t.fechaNacimiento.split("-").toTypedArray()
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
                return t.fechaNacimiento
            }

        })

    }

}
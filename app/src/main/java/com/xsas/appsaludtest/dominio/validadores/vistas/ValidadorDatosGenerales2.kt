package com.xsas.appsaludtest.dominio.validadores.vistas

import com.xsas.appsaludtest.datos.vistas.DatosGenerales2
import com.xsas.appsaludtest.dominio.validadores.Validador

class ValidadorDatosGenerales2(t:DatosGenerales2): Validador<DatosGenerales2>(t){
    override fun definirValidaciones() {

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                if (t.edad < 0)
                    return false
                else
                    return true
            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "La edad no puede ser menor a 0"
            }

            override fun propiedadInvalida(): Any {
                return t.edad
            }

        })

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.estadoCivil.isNotBlank()
            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "El estado civil no puede estar vacío"
            }

            override fun propiedadInvalida(): Any {
                return t.estadoCivil
            }

        })

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.nacionalidad.isNotBlank()
            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "La nacionadidad no puede estar vacío"
            }

            override fun propiedadInvalida(): Any {
                return t.nacionalidad
            }

        })

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.ocupacion.isNotBlank()
            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "El ocupacion no puede estar vacío"
            }

            override fun propiedadInvalida(): Any {
                return t.ocupacion
            }

        })

        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.residenciaAnterior.isNotBlank()
            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "La recidencia anterior no puede estar vacío"
            }

            override fun propiedadInvalida(): Any {
                return t.residenciaAnterior
            }

        })


        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.servicioMedico.isNotBlank()
            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "Servicio medico no puede estar vacío"
            }

            override fun propiedadInvalida(): Any {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })


        agregarValidacion(object : ValidadorPropiedad{
            override fun validar(): Boolean {
                return t.ultimoGradoEstudio.isNotBlank()
            }

        }, object: ErrorValidacion{
            override fun mensajeError(): String {
                return "El ultimo grado de estudio no puede estar vacío"
            }

            override fun propiedadInvalida(): Any {
                return t.ultimoGradoEstudio
            }

        })
    }

}
package com.xsas.appsaludtest.dominio.validadores

import java.util.ArrayList
import java.util.HashMap

abstract class Validador<T> protected constructor(protected var t: T) {

    interface ValidadorPropiedad {
        fun validar(): Boolean
    }

    interface ErrorValidacion {
        fun mensajeError(): String
        fun propiedadInvalida(): Any
    }

    private val validaciones = ArrayList<ValidadorPropiedad>()
    private val errores = HashMap<ValidadorPropiedad, ErrorValidacion>()
    private var ultimoError: ErrorValidacion? = null

    init {
        definirValidaciones()
    }

    protected abstract fun definirValidaciones()

    protected fun agregarValidacion(validadorPropiedad: ValidadorPropiedad) {
        validaciones.add(validadorPropiedad)
    }

    protected fun agregarValidacion(validadorPropiedad: ValidadorPropiedad, errorValidacion: ErrorValidacion?) {
        validaciones.add(validadorPropiedad)

        if (errorValidacion != null)
            errores[validadorPropiedad] = errorValidacion
    }

    fun ultimoError(): ErrorValidacion? {
        return ultimoError
    }

    fun validar(): Boolean {
        for (validadorPropiedad in validaciones) {
            if (!validadorPropiedad.validar()) {

                val errorValidacion = errores[validadorPropiedad]
                if (errorValidacion != null)
                    ultimoError = errorValidacion

                return false
            }
        }
        return true
    }
}

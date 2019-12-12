package com.xsas.appsaludtest.dominio.validadores

import java.util.ArrayList

class ValidadorPool {

    class Builder {

        internal val validadores = ArrayList<Validador<*>>()

        fun agregarValidador(validador: Validador<*>): Builder {
            validadores.add(validador)
            return this
        }

        fun build(): ValidadorPool {
            return ValidadorPool(this)
        }
    }

    private var validadores = ArrayList<Validador<*>>()
    private var ultimoError: Validador.ErrorValidacion? = null

    private constructor() {}

    private constructor(builder: Builder) {
        this.validadores = builder.validadores
    }

    fun ultimoError(): Validador.ErrorValidacion? {
        return ultimoError
    }

    fun agregarValidador(validador: Validador<*>) {
        validadores.add(validador)
    }

    fun validarTodo(): Boolean {
        for (index in validadores.indices) {
            val validadorActual = validadores[index]

            if (!validadorActual.validar()) {
                ultimoError = validadorActual.ultimoError()
                return false
            }
        }

        ultimoError = null
        return true
    }
}

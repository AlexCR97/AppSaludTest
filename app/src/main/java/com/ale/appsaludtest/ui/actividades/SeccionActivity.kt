package com.ale.appsaludtest.ui.actividades

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController

abstract class SeccionActivity : AppCompatActivity() {

    interface FragmentoAnteriorListener {
        fun alCambiarFragmento(numeroFragmento: Int)
    }

    interface FragmentoSiguienteListener {
        fun alCambiarFragmento(numeroFragmento: Int)
    }

    interface ActividadSiguienteListener {
        fun alCambiarActividad(numeroFragmento: Int)
    }

    private var numeroFragmento = 1

    abstract val cantidadFragmentos: Int
    abstract val navegaciones: Map<Int, Int>
    abstract val titulos: Map<Int, String>
    abstract val fragmentoAnteriorListener: FragmentoAnteriorListener
    abstract val fragmentoSiguienteListener: FragmentoSiguienteListener
    abstract val actividadSiguienteListener: ActividadSiguienteListener

    internal lateinit var nav: NavController

    fun fragmentoAnterior() {
        if (numeroFragmento <= 1)
            return

        numeroFragmento -= 1
        fragmentoAnteriorListener.alCambiarFragmento(numeroFragmento)
    }

    fun fragmentoSiguiente() {
        if (numeroFragmento >= cantidadFragmentos) {
            actividadSiguienteListener.alCambiarActividad(numeroFragmento)
            return
        }

        numeroFragmento += 1
        fragmentoSiguienteListener.alCambiarFragmento(numeroFragmento)
    }
}

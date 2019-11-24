package com.xsas.appsaludtest.dominio.casos.web

import android.content.Context

import com.xsas.appsaludtest.servicios.web.ServicioWeb

abstract class CasoUsoWeb<T>(
    protected var context: Context,
    protected var eventoPeticionAceptada: EventoPeticionAceptada<T>,
    protected var eventoPeticionRechazada: EventoPeticionRechazada
) {

    interface EventoPeticionAceptada<T> {
        fun alAceptarPeticion(t: T)
    }

    interface EventoPeticionRechazada {
        fun alRechazarPeticion()
    }

    protected abstract fun definirServicioWeb(): ServicioWeb<*>

    fun enviarPeticion(vararg args: Any) {
        val servicioWeb = definirServicioWeb()
        servicioWeb.enviarPeticion(*args)
    }
}


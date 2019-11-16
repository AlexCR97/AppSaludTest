package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.EstadosVivienda
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.servicios.web.ServicioWeb

class CUListarEstadosVivienda(context: Context,
                              eventoPeticionAceptada: EventoPeticionAceptada<List<EstadosVivienda>>,
                              eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<EstadosVivienda>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada) {

    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarEstadosVivienda(
            context,
            Listener { response ->
            val presentador = PresentadorListaEstadosVivienda()
            val estadosVivienda = presentador.procesar(response)

            eventoPeticionAceptada.alAceptarPeticion(estadosVivienda)
        }, Response.ErrorListener { error ->
            eventoPeticionRechazada.alRechazarPeticion()
        })
    }
}
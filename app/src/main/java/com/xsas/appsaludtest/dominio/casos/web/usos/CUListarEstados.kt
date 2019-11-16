package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.android.volley.Response.Listener
import com.xsas.appsaludtest.datos.entidades.Estados
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.servicios.web.ServicioWeb

class CUListarEstados(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Estados>>,
    eventoPeticionRechazada: EventoPeticionRechazada
    ) : CasoUsoWeb<List<Estados>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada) {

    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarColonias(context, Listener { response ->
            val presentador = PresentadorListaEstados()
            val estados = presentador.procesar(response)

            eventoPeticionAceptada.alAceptarPeticion(estados)
        }, Response.ErrorListener { error ->
            eventoPeticionRechazada.alRechazarPeticion()
        })
    }
}
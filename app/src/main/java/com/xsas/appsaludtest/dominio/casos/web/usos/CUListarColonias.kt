package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.Colonias
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.servicios.web.ServicioWeb

class CUListarColonias(
    contexto: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Colonias>>,
    eventoPeticionRechazada: EventoPeticionRechazada) :
    CasoUsoWeb<List<Colonias>>(
        contexto,
        eventoPeticionAceptada,
        eventoPeticionRechazada) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarColonias(context, Response.Listener { response ->
            val presentador = PresentadorListaColonias()
            val colonias = presentador.procesar(response)

            eventoPeticionAceptada.alAceptarPeticion(colonias)
        }, Response.ErrorListener { error ->
            eventoPeticionRechazada.alRechazarPeticion()
        })
    }
}
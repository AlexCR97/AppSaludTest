package com.xsas.appsaludtest.dominio.casos.web.usos


import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.EstadoVivienda
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaEstadoVivienda
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarEstadoVivienda

class CUListarEstadoVivienda(context: Context,
                              eventoPeticionAceptada: EventoPeticionAceptada<List<EstadoVivienda>>,
                              eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<EstadoVivienda>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada) {

    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarEstadoVivienda(
            context,
            Response.Listener { response ->
                val presentador = PresentadorListaEstadoVivienda()
                val estadosVivienda = presentador.procesar(response)

                eventoPeticionAceptada.alAceptarPeticion(estadosVivienda)
            }, Response.ErrorListener { error ->
                eventoPeticionRechazada.alRechazarPeticion()
            })
    }
}
package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.Flujo
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaFlujo
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarFlujos

class CUListarFlujos(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Flujo>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<Flujo>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarFlujos(
            context,
            Response.Listener {

                val presentador = PresentadorListaFlujo()
                val flujos = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(flujos)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
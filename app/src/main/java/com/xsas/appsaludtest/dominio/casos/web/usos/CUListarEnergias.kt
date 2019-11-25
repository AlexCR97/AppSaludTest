package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.Energia
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaEnergias
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarEnergias

class CUListarEnergias(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Energia>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<Energia>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarEnergias(
            context,
            Response.Listener {

                val presentador = PresentadorListaEnergias()
                val energias = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(energias)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
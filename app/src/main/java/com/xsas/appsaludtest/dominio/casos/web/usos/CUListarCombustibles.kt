package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.Combustible
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaCombustibles
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarCombustibles

class CUListarCombustibles(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Combustible>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<Combustible>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarCombustibles(
            context,
            Response.Listener {

                val presentador = PresentadorListaCombustibles()
                val combustibles = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(combustibles)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
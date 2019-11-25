package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.Servicio
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaServicios
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarServicios

class CUListarServicios(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Servicio>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<Servicio>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarServicios(
            context,
            Response.Listener {

                val presentador = PresentadorListaServicios()
                val servicios = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(servicios)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
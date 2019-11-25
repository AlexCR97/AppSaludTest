package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.TipoDeDeteccion
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaTiposDeDeteccion
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarTiposDeDetecciones

class CUListarTiposDeDeteccion(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<TipoDeDeteccion>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<TipoDeDeteccion>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarTiposDeDetecciones(
            context,
            Response.Listener {

                val presentador = PresentadorListaTiposDeDeteccion()
                val tiposDeDetecciones = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(tiposDeDetecciones)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
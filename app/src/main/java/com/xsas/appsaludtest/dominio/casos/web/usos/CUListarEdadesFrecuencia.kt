package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.EdadFrecuencia
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaEdadesFrecuencia
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarEdadesFrecuencias

class CUListarEdadesFrecuencia(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<EdadFrecuencia>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<EdadFrecuencia>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarEdadesFrecuencias(
            context,
            Response.Listener {

                val presentador = PresentadorListaEdadesFrecuencia()
                val edadesFrecuencias = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(edadesFrecuencias)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
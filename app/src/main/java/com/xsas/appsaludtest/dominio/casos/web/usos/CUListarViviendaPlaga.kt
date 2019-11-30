package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.ViviendaPlaga
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaViviendaPlaga
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarViviendaPlaga

class CUListarViviendaPlaga(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<ViviendaPlaga>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<ViviendaPlaga>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarViviendaPlaga(
            context,
            Response.Listener {

                val presentador = PresentadorListaViviendaPlaga()
                val viviendasPlaga = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(viviendasPlaga)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}   
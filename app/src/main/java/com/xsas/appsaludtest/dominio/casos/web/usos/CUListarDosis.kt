package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.Dosi
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListarDosis
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarDosis

class CUListarDosis(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Dosi>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<Dosi>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarDosis(
            context,
            Response.Listener {

                val presentador = PresentadorListarDosis()
                val dosis = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(dosis)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
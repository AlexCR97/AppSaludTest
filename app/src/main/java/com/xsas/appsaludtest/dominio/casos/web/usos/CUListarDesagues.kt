package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.Desague
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaDesagues
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarDesagues

class CUListarDesagues(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Desague>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<Desague>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarDesagues(
            context,
            Response.Listener {

                val presentador = PresentadorListaDesagues()
                val desagues = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(desagues)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
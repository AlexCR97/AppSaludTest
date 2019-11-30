package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.Tamiz
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaServicios
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaTamiz
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarTamiz

class CUListarTamiz(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Tamiz>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<Tamiz>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarTamiz(
            context,
            Response.Listener {

                val presentador = PresentadorListaTamiz()
                val tamices = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(tamices)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
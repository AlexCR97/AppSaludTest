package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.EscolaridadOcupacion
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaEscolaridadOcupaciones
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarEscolaridadesOcupaciones

class CUListarEscolaridadOcupacion(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<EscolaridadOcupacion>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<EscolaridadOcupacion>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarEscolaridadesOcupaciones(
            context,
            Response.Listener {

                val presentador = PresentadorListaEscolaridadOcupaciones()
                val escolaridadesOcupaciones = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(escolaridadesOcupaciones)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.EstadoCivil
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaEstadosCiviles
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarEstadosCiviles

class CUListarEstadosCiviles(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<EstadoCivil>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<EstadoCivil>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarEstadosCiviles(
            context,
            Response.Listener {

                val presentador = PresentadorListaEstadosCiviles()
                val estadosCiviles = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(estadosCiviles)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
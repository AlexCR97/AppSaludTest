package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.CentroDeSalud
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaCentrosDeSalud
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarCentroDeSalud

class CUListarCentrosDeSalud(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<CentroDeSalud>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<CentroDeSalud>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarCentroDeSalud(
            context,
            Response.Listener {

                val presentador = PresentadorListaCentrosDeSalud()
                val centrosDeSalud = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(centrosDeSalud)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}

package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.AdiccionInmunodeficiencia
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaAdiccionInmunodeficiencia
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarAdiccionInmunodeficiencia

class CUListarAdiccionInmunodeficiencia(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<AdiccionInmunodeficiencia>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<AdiccionInmunodeficiencia>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarAdiccionInmunodeficiencia(
            context,
            Response.Listener {

                val presentador = PresentadorListaAdiccionInmunodeficiencia()
                val adiccionesInmunodeficiencia = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(adiccionesInmunodeficiencia)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
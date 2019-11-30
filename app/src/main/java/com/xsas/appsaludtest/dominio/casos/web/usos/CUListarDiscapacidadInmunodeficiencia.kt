package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.DiscapacidadInmunodeficiencia
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaDiscapacidadInmunodeficiencia
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarDiscapacidadInmunodeficiencia

class CUListarDiscapacidadInmunodeficiencia(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<DiscapacidadInmunodeficiencia>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<DiscapacidadInmunodeficiencia>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarDiscapacidadInmunodeficiencia(
            context,
            Response.Listener {

                val presentador = PresentadorListaDiscapacidadInmunodeficiencia()
                val listaDiscapacidadInmunodeficiencia = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(listaDiscapacidadInmunodeficiencia)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
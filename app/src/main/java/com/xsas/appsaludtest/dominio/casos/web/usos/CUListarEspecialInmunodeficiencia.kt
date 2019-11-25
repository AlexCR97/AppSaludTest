package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.EspecialInmunodeficiencia
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaEspecialInmunodeficiencia
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarEspecialInmunodeficiencia

class CUListarEspecialInmunodeficiencia(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<EspecialInmunodeficiencia>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<EspecialInmunodeficiencia>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarEspecialInmunodeficiencia(
            context,
            Response.Listener {

                val presentador = PresentadorListaEspecialInmunodeficiencia()
                val especiales = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(especiales)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
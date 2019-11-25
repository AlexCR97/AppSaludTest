package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.UnidadColonia
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaUnidadColonia
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarUnidadColonia

class CUListarUnidadColonia(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<UnidadColonia>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<UnidadColonia>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarUnidadColonia(
            context,
            Response.Listener {

                val presentador = PresentadorListaUnidadColonia()
                val unidadColonias = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(unidadColonias)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
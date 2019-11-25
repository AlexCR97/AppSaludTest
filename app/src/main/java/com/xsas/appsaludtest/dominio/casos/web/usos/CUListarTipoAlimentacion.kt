package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.TipoAlimentacion
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaTipoAlimentacion
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarTiposAlimentaciones

class CUListarTipoAlimentacion(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<TipoAlimentacion>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<TipoAlimentacion>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarTiposAlimentaciones(
            context,
            Response.Listener {

                val presentador = PresentadorListaTipoAlimentacion()
                val tiposAlimentaciones = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(tiposAlimentaciones)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.Especiales
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaEspeciales
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarEspeciales

class CUListarEspeciales(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Especiales>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<Especiales>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarEspeciales(
            context,
            Response.Listener {

                val presentador = PresentadorListaEspeciales()
                val especiales = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(especiales)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}   
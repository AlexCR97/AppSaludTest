package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.TopEnfermedad
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaTopEnfermedad
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarTopEnfermedades

class CUListarTopEnfermedad(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<TopEnfermedad>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<TopEnfermedad>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarTopEnfermedades(
            context,
            Response.Listener {

                val presentador = PresentadorListaTopEnfermedad()
                val topEnfermedades = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(topEnfermedades)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
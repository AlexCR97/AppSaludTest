package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.Adiccion
import com.xsas.appsaludtest.datos.entidades.Adicciones
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaAdicciones
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarAdicciones

class CUListarAdicciones(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Adiccion>>,
    eventoPeticionRechazada: EventoPeticionRechazada):
    CasoUsoWeb<List<Adiccion>>(
        context,
        eventoPeticionAceptada,
        eventoPeticionRechazada) {

    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarAdicciones(
            context,
            Response.Listener {
                val presentador = PresentadorListaAdicciones()
                val adicciones = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(adicciones)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }

}
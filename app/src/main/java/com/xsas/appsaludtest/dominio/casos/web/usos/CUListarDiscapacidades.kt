package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.Discapacidad
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaDiscapacidades
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarDiscapacidadInmunodeficiencia
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarDiscapacidades

class CUListarDiscapacidades(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Discapacidad>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<Discapacidad>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarDiscapacidades(
            context,
            Response.Listener {

                val presentador = PresentadorListaDiscapacidades()
                val discapacidades = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(discapacidades)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
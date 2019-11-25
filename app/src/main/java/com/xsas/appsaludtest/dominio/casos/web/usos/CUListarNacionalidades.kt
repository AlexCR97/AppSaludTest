package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.Nacionalidad
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaNacionalidades
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarNacionalidades

class CUListarNacionalidades(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Nacionalidad>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<Nacionalidad>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarNacionalidades(
            context,
            Response.Listener {

                val presentador = PresentadorListaNacionalidades()
                val nacionalidades = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(nacionalidades)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
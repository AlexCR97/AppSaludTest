package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.GradoEstudio
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaGradoEstudios
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarFlujos
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarGradoEstudios

class CUListarGradosEstudio(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<GradoEstudio>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<GradoEstudio>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarGradoEstudios(
            context,
            Response.Listener {

                val presentador = PresentadorListaGradoEstudios()
                val gradoEstudios = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(gradoEstudios)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
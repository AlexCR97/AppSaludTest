package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.Jurisdiccion
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaJuridicciones
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarJurisdicciones

class CUListarJurisdicciones(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Jurisdiccion>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<Jurisdiccion>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarJurisdicciones(
            context,
            Response.Listener {

                val presentador = PresentadorListaJuridicciones()
                val jurisdicciones = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(jurisdicciones)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
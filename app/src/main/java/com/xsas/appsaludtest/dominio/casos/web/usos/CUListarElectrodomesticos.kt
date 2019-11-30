package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.Electrodomestico
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaElectrodomesticos
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarElectrodomesticos

class CUListarElectrodomesticos(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Electrodomestico>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<Electrodomestico>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarElectrodomesticos(
            context,
            Response.Listener {

                val presentador = PresentadorListaElectrodomesticos()
                val electrodomesticos = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(electrodomesticos)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
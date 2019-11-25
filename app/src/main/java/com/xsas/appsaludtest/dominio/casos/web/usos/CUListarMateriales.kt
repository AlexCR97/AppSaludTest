package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.Material
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaMateriales
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarMateriales

class CUListarMateriales(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Material>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<Material>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarMateriales(
            context,
            Response.Listener {

                val presentador = PresentadorListaMateriales()
                val materiales = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(materiales)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
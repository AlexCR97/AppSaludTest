package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.Municipio
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaMunicipios
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarMunicipios

class CUListarMunicipios(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Municipio>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<Municipio>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarMunicipios(
            context,
            Response.Listener {

                val presentador = PresentadorListaMunicipios()
                val municipios = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(municipios)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
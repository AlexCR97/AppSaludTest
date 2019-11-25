package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.MetodoDefinitivo
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaMetodosDefinitivos
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarMetodosDefinitivos

class CUListarMetodosDefinitivos(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<MetodoDefinitivo>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<MetodoDefinitivo>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarMetodosDefinitivos(
            context,
            Response.Listener {

                val presentador = PresentadorListaMetodosDefinitivos()
                val metodosDefinitivos = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(metodosDefinitivos)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
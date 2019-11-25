package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.CuentaCon
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaCuentaCon
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarCuentaCon

class CUListarCuentaCon(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<CuentaCon>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<CuentaCon>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarCuentaCon(
            context,
            Response.Listener {

                val presentador = PresentadorListaCuentaCon()
                val listaCuentaCon = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(listaCuentaCon)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.datos.entidades.CuentaConVivienda
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.dominio.presentadores.PresentadorListaCuentaConVivienda
import com.xsas.appsaludtest.servicios.web.ServicioWeb
import com.xsas.appsaludtest.servicios.web.peticiones.SWListarCuentaConVivienda

class CUListarCuentaConVivienda(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<CuentaConVivienda>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<CuentaConVivienda>>(
    context,
    eventoPeticionAceptada,
    eventoPeticionRechazada
) {
    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarCuentaConVivienda(
            context,
            Response.Listener {

                val presentador = PresentadorListaCuentaConVivienda()
                val cuentaConVivienda = presentador.procesar(it)

                eventoPeticionAceptada.alAceptarPeticion(cuentaConVivienda)
            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
            }
        )
    }
}
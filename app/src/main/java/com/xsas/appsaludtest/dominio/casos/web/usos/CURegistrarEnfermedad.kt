package com.xsas.appsaludtest.dominio.casos.web.usos

import android.content.Context
import com.android.volley.Response
import com.xsas.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.xsas.appsaludtest.servicios.web.ServicioWeb

class CURegistrarEnfermedad(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<String>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<String>(context, eventoPeticionAceptada, eventoPeticionRechazada) {

    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWRegistrarEnfermedad(
            context,
            Response.Listener {

                    //Sino, pues usar el presentador y transformar
                    response -> eventoPeticionAceptada.alAceptarPeticion(response)

            },
            Response.ErrorListener {
                eventoPeticionRechazada.alRechazarPeticion()
                // cuando se implemente este metodo
                // Registar con el dao, las vistas correspondientes.
            }
        )
    }
}


package com.ale.appsaludtest.dominio.casos.web.usos

import android.content.Context

import com.ale.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.ale.appsaludtest.servicios.web.ServicioWeb
import com.ale.appsaludtest.servicios.web.peticiones.SWRegistrarUsuario
import com.android.volley.Response

class CURegistrarUsuario(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<String>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<String>(context, eventoPeticionAceptada, eventoPeticionRechazada) {

    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWRegistrarUsuario(
            context,
            Response.Listener { response -> eventoPeticionAceptada.alAceptarPeticion(response) },
            Response.ErrorListener { eventoPeticionRechazada.alRechazarPeticion() }
        )
    }
}


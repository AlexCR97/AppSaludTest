package com.ale.appsaludtest.dominio.casos.web.usos

import android.content.Context
import android.util.Log

import com.ale.appsaludtest.dominio.presentadores.PresentadorListaUsuarios
import com.ale.appsaludtest.dominio.casos.web.CasoUsoWeb
import com.ale.appsaludtest.datos.entidades.Usuario
import com.ale.appsaludtest.servicios.web.ServicioWeb
import com.ale.appsaludtest.servicios.web.peticiones.SWListarUsuarios
import com.android.volley.Response

class CUListarUsuarios(
    context: Context,
    eventoPeticionAceptada: EventoPeticionAceptada<List<Usuario>>,
    eventoPeticionRechazada: EventoPeticionRechazada
) : CasoUsoWeb<List<Usuario>>(context, eventoPeticionAceptada, eventoPeticionRechazada) {

    override fun definirServicioWeb(): ServicioWeb<*> {
        return SWListarUsuarios(context, Response.Listener { response ->
            Log.d("JSON", "Response CUListarUsuarios: $response")

            val presentador = PresentadorListaUsuarios()
            val usuarios = presentador.procesar(response)

            eventoPeticionAceptada.alAceptarPeticion(usuarios)

        }, Response.ErrorListener { error ->
            Log.d("JSON", "Error CUListarUsuarios: " + error.message)

            eventoPeticionRechazada.alRechazarPeticion()
        })
    }
}

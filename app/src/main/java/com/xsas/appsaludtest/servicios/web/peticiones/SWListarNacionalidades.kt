package com.xsas.appsaludtest.servicios.web.peticiones

import android.content.Context
import com.xsas.appsaludtest.servicios.web.ServicioWebEscritura
import com.android.volley.Response
import com.xsas.appsaludtest.servicios.web.ServicioWebLectura
import org.json.JSONObject

class SWListarNacionalidades(
    context: Context,
    responseListener: Response.Listener<JSONObject>,
    errorListener: Response.ErrorListener
) : ServicioWebLectura(context, responseListener, errorListener) {

    override fun definirUrl(vararg args: Any): String {
        return "";
    }
}
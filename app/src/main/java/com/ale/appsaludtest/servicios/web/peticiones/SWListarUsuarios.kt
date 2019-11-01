package com.ale.appsaludtest.servicios.web.peticiones

import android.content.Context

import com.ale.appsaludtest.servicios.web.ServicioWebLectura
import com.android.volley.Response

import org.json.JSONObject

class SWListarUsuarios(
    context: Context,
    responseListener: Response.Listener<JSONObject>,
    errorListener: Response.ErrorListener
) : ServicioWebLectura(context, responseListener, errorListener) {

    override fun definirUrl(vararg args: Any): String {
        return ""
    }
}


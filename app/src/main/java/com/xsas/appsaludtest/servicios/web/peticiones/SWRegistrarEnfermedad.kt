package com.xsas.appsaludtest.servicios.web.peticiones

import android.content.Context
import com.xsas.appsaludtest.servicios.web.ServicioWebEscritura
import com.android.volley.Response

class SWRegistrarEnfermedad(
    context: Context,
    responseListener: Response.Listener<String>,
    errorListener: Response.ErrorListener
) : ServicioWebEscritura(context, responseListener, errorListener) {

    override fun definirParams(vararg args: Any): Map<String, String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun definirUrl(vararg args: Any): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
package com.xsas.appsaludtest.servicios.web

import android.content.Context

import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest

abstract class ServicioWebEscritura(
    context: Context,
    responseListener: Response.Listener<String>,
    errorListener: Response.ErrorListener
) : ServicioWeb<String>(context, responseListener, errorListener) {

    protected abstract fun definirParams(vararg args: Any): Map<String, String>

    override fun definirRequest(url: String, vararg args: Any): Request<*> {

        val stringRequest = object : StringRequest(Method.POST, url, responseListener, errorListener) {
            override fun getParams(): Map<String, String> {
                return definirParams(*args)
            }
        }

        stringRequest.retryPolicy = defaultRetryPolicy

        return stringRequest
    }

}

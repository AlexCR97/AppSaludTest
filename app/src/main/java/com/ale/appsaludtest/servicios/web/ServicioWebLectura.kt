package com.ale.appsaludtest.servicios.web

import android.content.Context

import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest

import org.json.JSONObject

abstract class ServicioWebLectura(
    context: Context,
    responseListener: Response.Listener<JSONObject>,
    errorListener: Response.ErrorListener
) : ServicioWeb<JSONObject>(context, responseListener, errorListener) {

    override fun definirRequest(url: String, vararg args: Any): Request<*> {
        val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null, responseListener, errorListener)
        jsonObjectRequest.retryPolicy = defaultRetryPolicy
        return jsonObjectRequest
    }

}

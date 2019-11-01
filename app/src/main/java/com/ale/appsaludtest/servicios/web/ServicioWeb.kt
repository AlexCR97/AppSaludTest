package com.ale.appsaludtest.servicios.web

import android.content.Context

import com.android.volley.DefaultRetryPolicy
import com.android.volley.Request
import com.android.volley.Response

abstract class ServicioWeb<T>(
    private val context: Context,
    protected var responseListener: Response.Listener<T>,
    protected var errorListener: Response.ErrorListener
) {

    protected val defaultRetryPolicy = DefaultRetryPolicy(
        DefaultRetryPolicy.DEFAULT_TIMEOUT_MS * 2,
        DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
        DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
    )

    protected abstract fun definirUrl(vararg args: Any): String

    protected abstract fun definirRequest(url: String, vararg args: Any): Request<*>

    fun enviarPeticion(vararg args: Any) {
        var url = definirUrl(*args)
        url = url.replace(" ", "%20")
        val request = definirRequest(url, *args)
        VolleySingleton.getInstance(context).addToRequestQueue(request)
    }

}

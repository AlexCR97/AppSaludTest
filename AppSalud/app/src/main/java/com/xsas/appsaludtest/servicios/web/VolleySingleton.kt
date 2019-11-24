package com.xsas.appsaludtest.servicios.web

import android.content.Context
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

class VolleySingleton constructor(context: Context) {

    companion object {

        @Volatile
        private var instance: VolleySingleton? = null

        fun getInstance(context: Context) = instance ?: synchronized(this) {
            instance ?: VolleySingleton(context).also { instance = it }
        }
    }

    val requestQueue: RequestQueue by lazy {
        Volley.newRequestQueue(context.applicationContext)
    }

    fun <T> addToRequestQueue(request: Request<T>) {
        requestQueue.add(request)
    }

}

package com.xsas.appsaludtest.dominio.presentadores

import org.json.JSONObject

abstract class Presentador<T> {

    abstract fun procesar(json: JSONObject): T

}

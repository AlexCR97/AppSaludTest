package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.TipoDeDeteccion
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaTiposDeDeteccion : Presentador<List<TipoDeDeteccion>>(){
    override fun procesar(json: JSONObject): List<TipoDeDeteccion> {
        val jsonArray = json.optJSONArray("tipos_deteccion")
        val tiposDeDeteccion = ArrayList<TipoDeDeteccion>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val tipoDeDeteccion = TipoDeDeteccion(
                Integer(jsonObject!!.optInt("id_tipo_deteccion")),
                jsonObject!!.optString("tipo_deteccion")
            )

            tiposDeDeteccion.add(tipoDeDeteccion)
        }

        return tiposDeDeteccion
    }

}
package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.TipoAlimentacion
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaTipoAlimentacion : Presentador<List<TipoAlimentacion>>(){
    override fun procesar(json: JSONObject): List<TipoAlimentacion> {
        val jsonArray = json.optJSONArray("tipos_alimentacion")
        val tiposAlimentaciones = ArrayList<TipoAlimentacion>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val tipoAlimentacion = TipoAlimentacion(
                Integer(jsonObject!!.optInt("id_tipo_alimentacion")),
                jsonObject!!.optString("alimentacion")
            )

            tiposAlimentaciones.add(tipoAlimentacion)
        }

        return tiposAlimentaciones
    }

}
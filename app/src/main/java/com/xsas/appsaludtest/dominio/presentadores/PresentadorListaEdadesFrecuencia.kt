package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.EdadFrecuencia
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaEdadesFrecuencia : Presentador<List<EdadFrecuencia>>(){
    override fun procesar(json: JSONObject): List<EdadFrecuencia> {
        val jsonArray = json.optJSONArray("edades_frecuencia")
        val edadesFrecuencia = ArrayList<EdadFrecuencia>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val edadFrecuencia = EdadFrecuencia(
                Integer(jsonObject!!.optInt("id_edad")),
                jsonObject!!.optString("frecuencia")
            )

            edadesFrecuencia.add(edadFrecuencia)
        }

        return edadesFrecuencia
    }

}
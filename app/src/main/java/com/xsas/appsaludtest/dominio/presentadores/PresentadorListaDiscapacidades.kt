package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Discapacidad
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaDiscapacidades : Presentador<List<Discapacidad>>(){
    override fun procesar(json: JSONObject): List<Discapacidad> {
        val jsonArray = json.optJSONArray("discapacidades")
        val discapacidades = ArrayList<Discapacidad>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val discapacidad = Discapacidad(
                Integer(jsonObject!!.optInt("id_discapacidad")),
                jsonObject!!.optString("discapacidad")
            )

            discapacidades.add(discapacidad)
        }

        return discapacidades
    }

}
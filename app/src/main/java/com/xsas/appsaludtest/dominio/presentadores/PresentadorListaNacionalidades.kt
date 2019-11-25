package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Nacionalidad
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaNacionalidades : Presentador<List<Nacionalidad>>(){
    override fun procesar(json: JSONObject): List<Nacionalidad> {
        val jsonArray = json.optJSONArray("nacionalidades")
        val nacionalidades = ArrayList<Nacionalidad>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val nacionalidad = Nacionalidad(
                Integer(jsonObject!!.optInt("id_nacionalidad")),
                jsonObject!!.optString("nacionalidad")
            )

            nacionalidades.add(nacionalidad)
        }

        return nacionalidades
    }

}
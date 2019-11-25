package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Energia
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaEnergias : Presentador<List<Energia>>(){
    override fun procesar(json: JSONObject): List<Energia> {
        val jsonArray = json.optJSONArray("energias")
        val energias = ArrayList<Energia>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val energia = Energia(
                Integer(jsonObject!!.optInt("id_energia")),
                jsonObject!!.optString("energia")
            )

            energias.add(energia)
        }

        return energias
    }

}
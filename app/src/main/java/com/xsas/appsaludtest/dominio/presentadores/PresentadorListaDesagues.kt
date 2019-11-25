package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Desague
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaDesagues : Presentador<List<Desague>>(){
    override fun procesar(json: JSONObject): List<Desague> {
        val jsonArray = json.optJSONArray("desagues")
        val desagues = ArrayList<Desague>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val desague = Desague(
                Integer(jsonObject!!.optInt("id_desague")),
                jsonObject!!.optString("desague")
            )

            desagues.add(desague)
        }

        return desagues
    }

}
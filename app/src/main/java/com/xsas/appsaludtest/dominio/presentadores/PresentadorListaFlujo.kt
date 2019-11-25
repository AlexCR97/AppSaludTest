package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Flujo
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaFlujo : Presentador<List<Flujo>>(){
    override fun procesar(json: JSONObject): List<Flujo> {
        val jsonArray = json.optJSONArray("flujos")
        val flujos = ArrayList<Flujo>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val flujo = Flujo(
                Integer(jsonObject!!.optInt("id_flujo")),
                jsonObject!!.optString("flujo")
            )

            flujos.add(flujo)
        }

        return flujos
    }

}
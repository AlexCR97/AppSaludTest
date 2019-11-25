package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Combustible
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaCombustibles : Presentador<List<Combustible>>(){
    override fun procesar(json: JSONObject): List<Combustible> {
        val jsonArray = json.optJSONArray("combustibles")
        val combustibles = ArrayList<Combustible>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val combustible = Combustible(
                Integer(jsonObject!!.optInt("id_combustible")),
                jsonObject!!.optString("combustible")
            )

            combustibles.add(combustible)
        }

        return combustibles
    }

}
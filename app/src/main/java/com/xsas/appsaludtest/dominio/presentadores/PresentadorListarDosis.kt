package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Dosi
import org.json.JSONException
import org.json.JSONObject

class PresentadorListarDosis : Presentador<List<Dosi>>(){
    override fun procesar(json: JSONObject): List<Dosi> {
        val jsonArray = json.optJSONArray("dosis")
        val listaDosis = ArrayList<Dosi>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val dosis = Dosi(
                Integer(jsonObject!!.optInt("id_dosis")),
                jsonObject!!.optString("dosis")
            )

            listaDosis.add(dosis)
        }

        return listaDosis
    }

}
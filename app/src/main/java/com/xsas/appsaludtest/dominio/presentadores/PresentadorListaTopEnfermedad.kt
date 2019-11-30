package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.TopEnfermedad
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaTopEnfermedad : Presentador<List<TopEnfermedad>>(){
    override fun procesar(json: JSONObject): List<TopEnfermedad> {
        val jsonArray = json.optJSONArray("top_enfermedades")
        val topEnfermedades = ArrayList<TopEnfermedad>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val topEnfermedad = TopEnfermedad(
                Integer(jsonObject!!.optInt("id_top_enfermedad")),
                jsonObject!!.optString("top_enfermedad")
            )

            topEnfermedades.add(topEnfermedad)
        }

        return topEnfermedades
    }

}
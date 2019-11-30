package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Especiales
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaEspeciales : Presentador<List<Especiales>>(){
    override fun procesar(json: JSONObject): List<Especiales> {
        val jsonArray = json.optJSONArray("especiales")
        val especiales = ArrayList<Especiales>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val especial = Especiales(
                jsonObject!!.optInt("id_especiales"),
                jsonObject!!.optString("especiales")
            )

            especiales.add(especial)
        }

        return especiales
    }

}
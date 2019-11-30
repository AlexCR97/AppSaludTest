package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Electrodomestico
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaElectrodomesticos : Presentador<List<Electrodomestico>>(){
    override fun procesar(json: JSONObject): List<Electrodomestico> {
        val jsonArray = json.optJSONArray("electrodomesticos")
        val electrodomesticos = ArrayList<Electrodomestico>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val electrodomestico = Electrodomestico(
                Integer(jsonObject!!.optInt("id_electrodomestico")),
                jsonObject!!.optString("electrodomestico")
            )

            electrodomesticos.add(electrodomestico)
        }

        return electrodomesticos
    }

}
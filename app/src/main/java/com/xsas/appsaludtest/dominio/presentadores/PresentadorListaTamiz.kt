package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Tamiz
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaTamiz : Presentador<List<Tamiz>>(){
    override fun procesar(json: JSONObject): List<Tamiz> {
        val jsonArray = json.optJSONArray("tamizes")
        val tamizes = ArrayList<Tamiz>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val tamiz = Tamiz(
                jsonObject!!.optBoolean("neonatal"),
                jsonObject!!.optBoolean("auditivo"),
                jsonObject!!.optLong("id_inmunizacion")
            )

            tamizes.add(tamiz)
        }

        return tamizes
    }

}
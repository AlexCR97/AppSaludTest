package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.CentroDeSalud
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaCentrosDeSalud : Presentador<List<CentroDeSalud>>(){
    override fun procesar(json: JSONObject): List<CentroDeSalud> {
        val jsonArray = json.optJSONArray("centros_de_salud")
        val centrosDeSalud = ArrayList<CentroDeSalud>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val centroDeSalud = CentroDeSalud(
                Integer(jsonObject!!.optInt("id_centro_salud")),
                jsonObject!!.optString("nombre")
            )

            centrosDeSalud.add(centroDeSalud)
        }

        return centrosDeSalud
    }

}
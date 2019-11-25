package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Servicio
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaServicios : Presentador<List<Servicio>>(){
    override fun procesar(json: JSONObject): List<Servicio> {
        val jsonArray = json.optJSONArray("servicios")
        val servicios = ArrayList<Servicio>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val servicio = Servicio(
                Integer(jsonObject!!.optInt("id_servicio")),
                jsonObject!!.optString("servicio")
            )

            servicios.add(servicio)
        }

        return servicios
    }

}
package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.EstadoCivil
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaEstadosCiviles : Presentador<List<EstadoCivil>>(){
    override fun procesar(json: JSONObject): List<EstadoCivil> {
        val jsonArray = json.optJSONArray("estados_civiles")
        val estadosCiviles = ArrayList<EstadoCivil>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val estadoCivil = EstadoCivil(
                Integer(jsonObject!!.optInt("id_estado_civil")),
                jsonObject!!.optString("estado_civil")
            )

            estadosCiviles.add(estadoCivil)
        }

        return estadosCiviles
    }

}
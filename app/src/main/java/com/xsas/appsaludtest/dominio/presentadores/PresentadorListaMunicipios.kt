package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Municipio
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaMunicipios : Presentador<List<Municipio>>(){
    override fun procesar(json: JSONObject): List<Municipio> {
        val jsonArray = json.optJSONArray("municipios")
        val municipios = ArrayList<Municipio>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val municipio = Municipio(
                Integer(jsonObject!!.optInt("id_municipio")),
                jsonObject!!.optString("municipio")
            )

            municipios.add(municipio)
        }

        return municipios
    }

}
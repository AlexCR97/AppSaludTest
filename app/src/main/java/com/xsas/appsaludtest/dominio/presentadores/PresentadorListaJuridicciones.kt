package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Jurisdiccion
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaJuridicciones : Presentador<List<Jurisdiccion>>(){
    override fun procesar(json: JSONObject): List<Jurisdiccion> {
        val jsonArray = json.optJSONArray("jurisdicciones")
        val juridicciones = ArrayList<Jurisdiccion>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val jurisdiccion = Jurisdiccion(
                Integer(jsonObject!!.optInt("id_jurisdiccion")),
                jsonObject!!.optString("jurisdiccion")
            )

            juridicciones.add(jurisdiccion)
        }

        return juridicciones
    }

}
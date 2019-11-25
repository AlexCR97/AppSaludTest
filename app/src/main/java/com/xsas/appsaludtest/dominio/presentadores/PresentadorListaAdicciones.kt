package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Adiccion
import com.xsas.appsaludtest.datos.entidades.Adicciones
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaAdicciones() : Presentador<List<Adiccion>>(){

    override fun procesar(json: JSONObject): List<Adiccion> {

        val jsonArray = json.optJSONArray("adicciones")
        val listaAdicciones = ArrayList<Adiccion>()

    for (i in 0 until jsonArray!!.length()) {
        var jsonObject : JSONObject? = null

        try {
            jsonObject = jsonArray.getJSONObject(i)
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        assert(jsonObject != null)

        val adiccion = Adiccion(
            Integer(jsonObject!!.optInt("id_adiccion")),
            jsonObject!!.optString("adiccion")
        )

        listaAdicciones.add(adiccion)
    }

        return listaAdicciones
    }
}
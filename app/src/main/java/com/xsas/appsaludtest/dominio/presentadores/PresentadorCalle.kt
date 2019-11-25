package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Calle
import org.json.JSONException
import org.json.JSONObject

class PresentadorCalle : Presentador<Calle>(){
    override fun procesar(json: JSONObject): Calle {

        val jsonArray = json.optJSONArray("calles")
        var jsonObject: JSONObject? = null

        try {
            jsonObject = jsonArray!!.getJSONObject(0)
        } catch (e: JSONException) {
            e.printStackTrace()
        }


        assert(jsonObject != null)
        val id = jsonObject!!.optInt("id_calle")
        val calle = jsonObject!!.optString("calle")

        val calleObj = Calle(id,calle)


        return calleObj
    }

}
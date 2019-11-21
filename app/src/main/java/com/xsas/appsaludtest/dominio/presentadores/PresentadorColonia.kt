package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Colonia
import org.json.JSONException
import org.json.JSONObject

class PresentadorColonia : Presentador<Colonia>(){
    override fun procesar(json: JSONObject): Colonia {

        val jsonArray = json.optJSONArray("colonias")
        var jsonObject: JSONObject? = null

        try {
            jsonObject = jsonArray!!.getJSONObject(0)
        } catch (e: JSONException) {
            e.printStackTrace()
        }


        assert(jsonObject != null)
        val id = jsonObject!!.optInt("id_colonias")
        val colonia = jsonObject!!.optString("colonia")

        val coloniaObj = Colonia(id,colonia)


        return coloniaObj

    }

}
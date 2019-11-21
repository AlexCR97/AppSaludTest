package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Colonia
import org.json.JSONException
import org.json.JSONObject
import java.util.ArrayList

class PresentadorListaColonias : Presentador<List<Colonia>>() {
    override fun procesar(json: JSONObject): List<Colonia> {
        val jsonArray = json.optJSONArray("colonias")
        val coloniaList = ArrayList<Colonia>()

        for (i in 0 until jsonArray!!.length()) {
            var jsonObject: JSONObject? = null
            try {
                jsonObject = jsonArray.getJSONObject(i)
            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val colonia = Colonia(
                json.optInt("id_colonias"),
                json.optString("colonia")
            )

            coloniaList.add(colonia)
        }
        return coloniaList
    }

}

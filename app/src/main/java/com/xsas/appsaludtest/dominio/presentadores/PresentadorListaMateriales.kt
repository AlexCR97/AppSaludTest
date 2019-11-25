package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Material
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaMateriales : Presentador<List<Material>>(){
    override fun procesar(json: JSONObject): List<Material> {
        val jsonArray = json.optJSONArray("materiales")
        val materiales = ArrayList<Material>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val material = Material(
                Integer(jsonObject!!.optInt("id_material")),
                jsonObject!!.optString("material")
            )

            materiales.add(material)
        }

        return materiales
    }

}
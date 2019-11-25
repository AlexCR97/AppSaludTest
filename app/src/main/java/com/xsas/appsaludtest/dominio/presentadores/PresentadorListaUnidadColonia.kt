package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.UnidadColonia
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaUnidadColonia : Presentador<List<UnidadColonia>>(){
    override fun procesar(json: JSONObject): List<UnidadColonia> {
        val jsonArray = json.optJSONArray("unidades_colonia")
        val unidadesColonia = ArrayList<UnidadColonia>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val unidadColonia = UnidadColonia(
                Integer(jsonObject!!.optInt("id_unidad")),
                Integer(jsonObject!!.optInt("id_colonia"))
            )

            unidadesColonia.add(unidadColonia)
        }

        return unidadesColonia
    }

}
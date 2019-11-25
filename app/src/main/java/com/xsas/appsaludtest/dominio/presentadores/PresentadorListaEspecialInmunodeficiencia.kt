package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.EspecialInmunodeficiencia
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaEspecialInmunodeficiencia : Presentador<List<EspecialInmunodeficiencia>>(){
    override fun procesar(json: JSONObject): List<EspecialInmunodeficiencia> {
        val jsonArray = json.optJSONArray("especiales_inmunodeficiencia")
        val especialesInmunodeficiencia = ArrayList<EspecialInmunodeficiencia>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val especialInmunodeficiencia = EspecialInmunodeficiencia(
                jsonObject!!.optInt("id_especial"),
                jsonObject!!.optLong("id_inmunizacion")
            )

            especialesInmunodeficiencia.add(especialInmunodeficiencia)
        }

        return especialesInmunodeficiencia
    }

}
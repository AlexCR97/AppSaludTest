package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.DiscapacidadInmunodeficiencia
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaDiscapacidadInmunodeficiencia : Presentador<List<DiscapacidadInmunodeficiencia>>(){
    override fun procesar(json: JSONObject): List<DiscapacidadInmunodeficiencia> {
        val jsonArray = json.optJSONArray("discapacidad_inmunodeficiencia")
        val listaDiscapacidades = ArrayList<DiscapacidadInmunodeficiencia>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val discapacidadInmunodeficiencia = DiscapacidadInmunodeficiencia(
                jsonObject!!.optInt("id_discapacidad"),
                jsonObject!!.optLong("id_inmunizacion")
            )

            listaDiscapacidades.add(discapacidadInmunodeficiencia)
        }

        return listaDiscapacidades
    }

}
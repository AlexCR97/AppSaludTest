package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.ViviendaPlaga
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaViviendaPlaga : Presentador<List<ViviendaPlaga>>(){
    override fun procesar(json: JSONObject): List<ViviendaPlaga> {
        val jsonArray = json.optJSONArray("vivienda_plagas")
        val viviendasPlaga = ArrayList<ViviendaPlaga>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val viviendaPlaga = ViviendaPlaga(
                Integer(jsonObject!!.optInt("id_vivienda")),
                Integer(jsonObject!!.optInt("id_plaga"))
            )

            viviendasPlaga.add(viviendaPlaga)
        }

        return viviendasPlaga
    }

}
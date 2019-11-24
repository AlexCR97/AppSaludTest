package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.EstadoVivienda
import org.json.JSONException
import org.json.JSONObject
import java.math.BigInteger
import java.util.ArrayList


class PresentadorListaEstadoVivienda : Presentador<List<EstadoVivienda>>(){
    override fun procesar(json: JSONObject): List<EstadoVivienda> {
        val jsonArray = json.optJSONArray("estados_viviendas")
        val estadoViviendaList = ArrayList<EstadoVivienda>()

        for (i in 0 until jsonArray!!.length()) {
            var jsonObject: JSONObject? = null
            try {
                jsonObject = jsonArray.getJSONObject(i)
            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val estadoVivienda = EstadoVivienda(
                json.optInt("id_estado"),
                json.optString("estado_vivienda")
            )

            estadoViviendaList.add(estadoVivienda)
        }
        return estadoViviendaList
    }

}
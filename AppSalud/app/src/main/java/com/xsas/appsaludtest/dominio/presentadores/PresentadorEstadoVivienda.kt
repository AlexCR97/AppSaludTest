package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.EstadoVivienda
import org.json.JSONException
import org.json.JSONObject
import java.math.BigInteger

class PresentadorEstadoVivienda : Presentador<EstadoVivienda>(){
    override fun procesar(json: JSONObject): EstadoVivienda {
        val jsonArray = json.optJSONArray("estados_viviendas")
        var jsonObject: JSONObject? = null

        try {
            jsonObject = jsonArray!!.getJSONObject(0)
        } catch (e: JSONException) {
            e.printStackTrace()
        }


        assert(jsonObject != null)
        val id = jsonObject!!.optInt("id_estado")
        val colonia = jsonObject!!.optString("estado_vivienda")

        val estadoViviendaObj = EstadoVivienda(id as BigInteger,colonia)


        return estadoViviendaObj
    }

}
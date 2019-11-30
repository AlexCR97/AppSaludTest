package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Adiccion
import com.xsas.appsaludtest.datos.entidades.AdiccionInmunodeficiencia
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaAdiccionInmunodeficiencia : Presentador<List<AdiccionInmunodeficiencia>>(){
    override fun procesar(json: JSONObject): List<AdiccionInmunodeficiencia> {
        val jsonArray = json.optJSONArray("adicciones_inmunodeficiencia")
        val adiccionesInmunodeficiencia = ArrayList<AdiccionInmunodeficiencia>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val adiccionInmunodeficiencia = AdiccionInmunodeficiencia(
                jsonObject!!.optInt("id_adiccion"),
                jsonObject!!.optLong("id_inmunizacion"),
                jsonObject!!.optInt("veces_dia"),
                jsonObject!!.optInt("veces_semana")
            )

            adiccionesInmunodeficiencia.add(adiccionInmunodeficiencia)
        }

        return adiccionesInmunodeficiencia
    }

}
package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.EscolaridadOcupacion
import org.json.JSONException
import org.json.JSONObject
import java.math.BigInteger

class PresentadorListaEscolaridadOcupaciones : Presentador<List<EscolaridadOcupacion>>(){
    override fun procesar(json: JSONObject): List<EscolaridadOcupacion> {
        val jsonArray = json.optJSONArray("escolaridades_ocupaciones")
        val listaEscolaridadOcupaciones = ArrayList<EscolaridadOcupacion>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val escolaridadOcupacion = EscolaridadOcupacion(
                jsonObject!!.optInt("id_escolaridad_ocupacion").toBigInteger(),
                jsonObject!!.optString("escolaridad_ocupacion")
            )

            listaEscolaridadOcupaciones.add(escolaridadOcupacion)
        }

        return listaEscolaridadOcupaciones
    }

}
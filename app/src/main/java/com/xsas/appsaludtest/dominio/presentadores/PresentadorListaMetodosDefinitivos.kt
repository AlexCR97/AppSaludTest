package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.MetodoDefinitivo
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaMetodosDefinitivos : Presentador<List<MetodoDefinitivo>>(){
    override fun procesar(json: JSONObject): List<MetodoDefinitivo> {
        val jsonArray = json.optJSONArray("metodos_definitivos")
        val metodosDefinitivos = ArrayList<MetodoDefinitivo>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val metodoDefinitivo = MetodoDefinitivo(
                Integer(jsonObject!!.optInt("id_metodo_definitivo")),
                jsonObject!!.optString("metodo_definitivo")
            )

            metodosDefinitivos.add(metodoDefinitivo)
        }

        return metodosDefinitivos
    }

}
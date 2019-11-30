package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.CuentaConVivienda
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaCuentaConVivienda : Presentador<List<CuentaConVivienda>>(){
    override fun procesar(json: JSONObject): List<CuentaConVivienda> {
        val jsonArray = json.optJSONArray("cuenta_con_vivienda")
        val listaCuentaConVivienda = ArrayList<CuentaConVivienda>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val cuentaConVivienda = CuentaConVivienda(
                Integer(jsonObject!!.optInt("id_cuenta")),
                Integer(jsonObject!!.optInt("id_caracteristica"))
            )

            listaCuentaConVivienda.add(cuentaConVivienda)
        }

        return listaCuentaConVivienda
    }

}
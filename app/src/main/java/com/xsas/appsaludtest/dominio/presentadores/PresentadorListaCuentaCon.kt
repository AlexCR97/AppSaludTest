package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.CuentaCon
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaCuentaCon : Presentador<List<CuentaCon>>(){
    override fun procesar(json: JSONObject): List<CuentaCon> {
        val jsonArray = json.optJSONArray("cuenta_con")
        val listaCuentaCon = ArrayList<CuentaCon>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val cuentaCon = CuentaCon(
                Integer(jsonObject!!.optInt("id_cuenta_con")),
                jsonObject!!.optString("espacio")
            )

            listaCuentaCon.add(cuentaCon)
        }

        return listaCuentaCon
    }

}
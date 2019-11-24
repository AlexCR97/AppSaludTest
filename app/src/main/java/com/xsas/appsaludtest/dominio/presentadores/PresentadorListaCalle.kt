package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Calle
import org.json.JSONException
import org.json.JSONObject
import java.math.BigInteger
import java.util.ArrayList

class PresentadorListaCalle : Presentador<List<Calle>>(){
    override fun procesar(json: JSONObject): List<Calle> {
        val jsonArray = json.optJSONArray("calles")
        val calleList = ArrayList<Calle>()

        for (i in 0 until jsonArray!!.length()) {
            var jsonObject: JSONObject? = null
            try {
                jsonObject = jsonArray.getJSONObject(i)
            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val calle = Calle(
                json.optInt("id_calle"),
                json.optString("calle")
            )

            calleList.add(calle)
        }
        return calleList

    }

}
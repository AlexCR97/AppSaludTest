package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.UnidadAtencion
import org.json.JSONException
import org.json.JSONObject

class PresentadorUnidadAtencion : Presentador<UnidadAtencion>(){
    override fun procesar(json: JSONObject): UnidadAtencion {

        val jsonArray = json.optJSONArray("unidad_de_atencion")
        var jsonObject: JSONObject? = null

        try {
            jsonObject = jsonArray!!.getJSONObject(0)
        } catch (e: JSONException) {
            e.printStackTrace()
        }


        assert(jsonObject != null)
        val idUnidad = jsonObject!!.optInt("id_unidad")
        val idJurisdiccion = jsonObject!!.optInt("id_jurisdiccion")
        val idMunicipio = jsonObject!!.optInt("id_municipio")
        val idCentro = jsonObject!!.optString("id_centro")



        val unidadObj = UnidadAtencion(idUnidad,idJurisdiccion,idMunicipio,idCentro)


        return unidadObj
    }

}
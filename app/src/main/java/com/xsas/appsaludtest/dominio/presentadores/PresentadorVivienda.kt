package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.Vivienda
import org.json.JSONException
import org.json.JSONObject

class PresentadorVivienda : Presentador<Vivienda>(){
    override fun procesar(json: JSONObject): Vivienda {
        val jsonArray = json.optJSONArray("viviendas")
        var jsonObject: JSONObject? = null

        try {
            jsonObject = jsonArray!!.getJSONObject(0)
        } catch (e: JSONException) {
            e.printStackTrace()
        }


        assert(jsonObject != null)
        val idVivienda = jsonObject!!.optInt("id_vivienda")
        val idColonia = jsonObject!!.optString("id_colonia")
        val idCalle = jsonObject!!.optString("id_calle")
        val numeroExterior= jsonObject!!.optInt("numero_ext")
        val numeroInterior = jsonObject!!.optInt("numero_int")
        val codigoPostal = jsonObject!!.optInt("codigo_postal")
        val telefonoCasa = jsonObject!!.optString("telefono_casa")
        val referenciaUbicacion = jsonObject!!.optString("referencia_de_ubicacion")
        val idUnidad = jsonObject!!.optInt("id_unidad")


        val viviendaObj = Vivienda(
            idVivienda,
            idColonia,
            idCalle,
            numeroExterior,
            numeroInterior,
            codigoPostal,
            telefonoCasa,
            referenciaUbicacion,
            idUnidad)


        return viviendaObj
    }

}
package com.xsas.appsaludtest.dominio.presentadores

import com.xsas.appsaludtest.datos.entidades.GradoEstudio
import org.json.JSONException
import org.json.JSONObject

class PresentadorListaGradoEstudios : Presentador<List<GradoEstudio>>(){
    override fun procesar(json: JSONObject): List<GradoEstudio> {
        val jsonArray = json.optJSONArray("grados_estudio")
        val gradoEstudios = ArrayList<GradoEstudio>()

        for(i in 0 until jsonArray.length()) {
            var jsonObject: JSONObject? = null
            try{

                jsonObject = jsonArray.optJSONObject(i)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val gradoEstudio = GradoEstudio(
                Integer(jsonObject!!.optInt("id_grado_estudio")),
                jsonObject!!.optString("grado_estudio")
            )

            gradoEstudios.add(gradoEstudio)
        }

        return gradoEstudios
    }

}
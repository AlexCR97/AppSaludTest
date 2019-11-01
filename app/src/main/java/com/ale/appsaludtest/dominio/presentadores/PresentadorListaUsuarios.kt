package com.ale.appsaludtest.dominio.presentadores

import com.ale.appsaludtest.entidades.Usuario

import org.json.JSONException
import org.json.JSONObject

import java.util.ArrayList

class PresentadorListaUsuarios : Presentador<List<Usuario>>() {

    override fun procesar(json: JSONObject): List<Usuario> {
        val jsonArray = json.optJSONArray("user")
        val usuarios = ArrayList<Usuario>()

        for (i in 0 until jsonArray!!.length()) {
            var jsonObject: JSONObject? = null
            try {
                jsonObject = jsonArray.getJSONObject(i)
            } catch (e: JSONException) {
                e.printStackTrace()
            }

            assert(jsonObject != null)

            val user = Usuario(
                json.optString(""),
                json.optString(""),
                json.optString("")
            )

            usuarios.add(user)
        }
        return usuarios
    }
}

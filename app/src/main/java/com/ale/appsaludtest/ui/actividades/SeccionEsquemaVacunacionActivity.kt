package com.ale.appsaludtest.ui.actividades

import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ale.appsaludtest.R
import com.ale.appsaludtest.datos.vistas.EsquemaVacunacion
import com.ale.appsaludtest.ui.adaptadores.EsquemaVacunacionAdapter
import kotlinx.android.synthetic.main.activity_seccion_esquema_vacunacion.*

class SeccionEsquemaVacunacionActivity : SeccionActivity() {

    override val cantidadFragmentos: Int
        get() = 1

    override val navegaciones: Map<Int, Int>
        get() = mapOf()

    override val titulos: Map<Int, String>
        get() = mapOf()

    override val fragmentoAnteriorListener: FragmentoAnteriorListener
        get() = object : FragmentoAnteriorListener {
            override fun alCambiarFragmento(numeroFragmento: Int) {
                onBackPressed()
            }
        }

    override val fragmentoSiguienteListener: FragmentoSiguienteListener
        get() = object : FragmentoSiguienteListener {
            override fun alCambiarFragmento(numeroFragmento: Int) {

            }
        }

    override val actividadSiguienteListener: ActividadSiguienteListener
        get() = object : ActividadSiguienteListener {
            override fun alCambiarActividad(numeroFragmento: Int) {
                val intent = Intent(this@SeccionEsquemaVacunacionActivity, SeccionEsquemaVacunacionNinoActivity::class.java)
                startActivity(intent)
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seccion_esquema_vacunacion)

        bAnterior.setOnClickListener {
            fragmentoAnterior()
        }

        bSiguiente.setOnClickListener {
            fragmentoSiguiente()
        }

        val vistas = arrayListOf(
            EsquemaVacunacion(),
            EsquemaVacunacion(),
            EsquemaVacunacion()
        )

        rvEsquemaVacunacion.adapter = EsquemaVacunacionAdapter(vistas, this)
        rvEsquemaVacunacion.layoutManager = LinearLayoutManager(this)

        tvNumeroFragmento.text = "1 / $cantidadFragmentos"
        //tvTituloFragmento.text = titulos[1]
    }
}

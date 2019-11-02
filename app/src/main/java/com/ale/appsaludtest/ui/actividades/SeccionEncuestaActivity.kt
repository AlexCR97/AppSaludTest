package com.ale.appsaludtest.ui.actividades

import android.os.Bundle
import android.widget.Toast
import androidx.navigation.findNavController
import com.ale.appsaludtest.R
import kotlinx.android.synthetic.main.activity_seccion_encuesta.*

class SeccionEncuestaActivity : SeccionActivity() {

    override val cantidadFragmentos: Int
        get() = 3

    override val navegaciones: Map<Int, Int>
        get() = mapOf()

    override val titulos: Map<Int, String>
        get() = mapOf()

    override val fragmentoAnteriorListener: FragmentoAnteriorListener
        get() = object: FragmentoAnteriorListener {
            override fun alCambiarFragmento(numeroFragmento: Int) {
                tvNumeroFragmento.text = "$numeroFragmento / $cantidadFragmentos"
            }
        }

    override val fragmentoSiguienteListener: FragmentoSiguienteListener
        get() = object: FragmentoSiguienteListener {
            override fun alCambiarFragmento(numeroFragmento: Int) {
                tvNumeroFragmento.text = "$numeroFragmento / $cantidadFragmentos"
            }
        }

    override val actividadSiguienteListener: ActividadSiguienteListener
        get() = object: ActividadSiguienteListener {
            override fun alCambiarActividad(numeroFragmento: Int) {
                Toast.makeText(this@SeccionEncuestaActivity, "Actividad siguiente", Toast.LENGTH_SHORT).show()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seccion_encuesta)

        nav = findNavController(R.id.navHostFragment)

        bAnterior.setOnClickListener {
            fragmentoAnterior()
        }

        bSiguiente.setOnClickListener {
            fragmentoSiguiente()
        }
    }
}

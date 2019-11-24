package com.xsas.appsaludtest.ui.actividades

import android.os.Bundle
import androidx.navigation.findNavController
import com.xsas.appsaludtest.R
import kotlinx.android.synthetic.main.activity_seccion_esquema_vacunacion_anciano.*

class SeccionEsquemaVacunacionAncianoActivity : SeccionActivity() {

    override val cantidadFragmentos: Int
        get() = 3

    override val navegaciones: Map<Int, Int>
        get() = mapOf(
            2 to R.id.action_seccionEsquemaVacunacionAnciano1Fragment_to_seccionEsquemaVacunacionAnciano2Fragment,
            3 to R.id.action_seccionEsquemaVacunacionAnciano2Fragment_to_seccionEsquemaVacunacionAnciano3Fragment
        )

    override val titulos: Map<Int, String>
        get() = mapOf()

    override val fragmentoAnteriorListener: FragmentoAnteriorListener
        get() = object : FragmentoAnteriorListener {
            override fun alCambiarFragmento(numeroFragmento: Int) {
                onBackPressed()
                tvNumeroFragmento.text = "$numeroFragmento / $cantidadFragmentos"
            }
        }

    override val fragmentoSiguienteListener: FragmentoSiguienteListener
        get() = object : FragmentoSiguienteListener {
            override fun alCambiarFragmento(numeroFragmento: Int) {
                nav.navigate(navegaciones[numeroFragmento]!!)
                tvNumeroFragmento.text = "$numeroFragmento / $cantidadFragmentos"
            }
        }

    override val actividadSiguienteListener: ActividadSiguienteListener
        get() = object : ActividadSiguienteListener {
            override fun alCambiarActividad(numeroFragmento: Int) {

            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seccion_esquema_vacunacion_anciano)

        nav = findNavController(R.id.navHostFragment)

        bAnterior.setOnClickListener {
            fragmentoAnterior()
        }

        bSiguiente.setOnClickListener {
            fragmentoSiguiente()
        }

        tvNumeroFragmento.text = "1 / $cantidadFragmentos"
        //tvTituloFragmento.text = titulos[1]
    }
}

package com.ale.appsaludtest.ui.actividades

import android.os.Bundle
import androidx.navigation.findNavController
import com.ale.appsaludtest.R
import kotlinx.android.synthetic.main.activity_seccion_esquema_vacunacion_adulto_mujer.*

class SeccionEsquemaVacunacionAdultoMujerActivity : SeccionActivity() {

    override val cantidadFragmentos: Int
        get() = 4

    override val navegaciones: Map<Int, Int>
        get() = mapOf(
            2 to R.id.action_seccionEsquemaVacunacionAdultoMujer1Fragment_to_seccionEsquemaVacunacionAdultoMujer2Fragment,
            3 to R.id.action_seccionEsquemaVacunacionAdultoMujer2Fragment_to_seccionEsquemaVacunacionAdultoMujer3Fragment,
            4 to R.id.action_seccionEsquemaVacunacionAdultoMujer3Fragment_to_seccionEsquemaVacunacionAdultoMujer4Fragment
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
        setContentView(R.layout.activity_seccion_esquema_vacunacion_adulto_hombre)

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
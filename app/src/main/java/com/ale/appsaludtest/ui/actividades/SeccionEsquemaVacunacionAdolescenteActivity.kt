package com.ale.appsaludtest.ui.actividades

import android.os.Bundle
import androidx.navigation.findNavController
import com.ale.appsaludtest.R
import kotlinx.android.synthetic.main.activity_seccion_esquema_vacunacion_adolescente.*

class SeccionEsquemaVacunacionAdolescenteActivity : SeccionActivity() {

    override val cantidadFragmentos: Int
        get() = 6

    override val navegaciones: Map<Int, Int>
        get() = mapOf(
            2 to R.id.action_seccionEsquemaVacunacionAdolescente1Fragment_to_seccionDatosGenerales2Fragment,
            3 to R.id.action_seccionEsquemaVacunacionAdolescente2Fragment_to_seccionDatosGenerales3Fragment,
            4 to R.id.action_seccionEsquemaVacunacionAdolescente3Fragment_to_seccionDatosGenerales4Fragment,
            5 to R.id.action_seccionEsquemaVacunacionAdolescente4Fragment_to_seccionDatosGenerales5Fragment,
            6 to R.id.action_seccionEsquemaVacunacionAdolescente5Fragment_to_seccionDatosGenerales6Fragment
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
        setContentView(R.layout.activity_seccion_esquema_vacunacion_adolescente)

        nav = findNavController(R.id.navHostFragment)

        bAnterior.setOnClickListener {
            fragmentoAnterior()
        }

        bSiguiente.setOnClickListener {
            fragmentoSiguiente()
        }
    }
}

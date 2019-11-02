package com.ale.appsaludtest.ui.actividades

import android.os.Bundle
import androidx.navigation.findNavController
import com.ale.appsaludtest.R
import kotlinx.android.synthetic.main.activity_seccion_georeferenciacion.*

class SeccionGeoreferenciacionActivity : SeccionActivity() {

    override val cantidadFragmentos: Int
        get() = 3

    override val navegaciones: Map<Int, Int>
        get() = mapOf(
            2 to R.id.action_georeferenciacion1Fragment_to_georeferenciacion2Fragment,
            3 to R.id.action_georeferenciacion2Fragment_to_seccionGeoreferenciacion3Fragment
        )

    override val titulos: Map<Int, String>
        get() = mapOf(
            1 to "Unidad de atención",
            2 to "Vivienda donde se aplica la encuesta",
            3 to "Vivienda donde se aplica la encuesta"
        )

    override val fragmentoAnteriorListener: FragmentoAnteriorListener
        get() = object: FragmentoAnteriorListener {
            override fun alCambiarFragmento(numeroFragmento: Int) {
                onBackPressed()
                tvNumeroFragmento.text = "$numeroFragmento / $cantidadFragmentos"
                tvTituloFragmento.text = titulos[numeroFragmento]
            }
        }

    override val fragmentoSiguienteListener: FragmentoSiguienteListener
        get() = object: FragmentoSiguienteListener {
            override fun alCambiarFragmento(numeroFragmento: Int) {
                nav.navigate(navegaciones[numeroFragmento]!!)
                tvNumeroFragmento.text = "$numeroFragmento / $cantidadFragmentos"
                tvTituloFragmento.text = titulos[numeroFragmento]
            }
        }

    override val actividadSiguienteListener: ActividadSiguienteListener
        get() = object: ActividadSiguienteListener {
            override fun alCambiarActividad(numeroFragmento: Int) {

            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seccion_georeferenciacion)

        nav = findNavController(R.id.navHostFragment)

        bAnterior.setOnClickListener {
            fragmentoAnterior()
        }

        bSiguiente.setOnClickListener {
            fragmentoSiguiente()
        }

        fragmentoAnterior()
    }
}
